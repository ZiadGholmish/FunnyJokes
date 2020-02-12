package com.ziad.db_prepare.populaters

import android.content.Context
import android.util.Log
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.ziad.db.entities.CategoryEntity
import com.ziad.db.entities.JokeEntity
import com.ziad.db.repo.interfaces.JokesCategoriesRepo
import com.ziad.db.repo.interfaces.JokesRepo
import com.ziad.db_prepare.models.RedditJokeModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.IOException
import javax.inject.Inject
import javax.inject.Singleton

class RedditJokesPopulater(
    private val jokesRepo: JokesRepo,
    private val context: Context
) {

    companion object {
        private const val SAMPLE_REDDIT_JOKE_ID = "5tz52q"
    }

    private val fileNames = listOf(
        "reddit_jokes_1.json",
        "reddit_jokes_2.json",
        "reddit_jokes_3.json",
        "reddit_jokes_4.json",
        "reddit_jokes_5.json",
        "reddit_jokes_6.json"
    )

    private val moshi by lazy { Moshi.Builder().build() }

    private val listType by lazy {
        Types.newParameterizedType(
            List::class.java,
            RedditJokeModel::class.java
        )
    }
    private val adapter: JsonAdapter<List<RedditJokeModel>> = moshi.adapter(listType)

    suspend fun validateJokes() {
        if (isJokesSaved()) return
        saveData()
    }

    private suspend fun isJokesSaved() = withContext(Dispatchers.IO) {
        return@withContext jokesRepo.get(SAMPLE_REDDIT_JOKE_ID).isNullOrEmpty().not()
    }

    private suspend fun saveData() {
        kotlin.runCatching {
            fileNames.forEach { fileName ->
                val jokesResult = parseCurrentList(fileName)
                saveJokes(jokesResult)
            }
        }.getOrElse {
            it.printStackTrace()
        }
    }

    private suspend fun saveJokes(jokes: List<RedditJokeModel>?) {
        withContext(Dispatchers.IO) {
            jokes?.forEach {
                jokesRepo.insert(
                    JokeEntity(
                        id = it.id,
                        title = it.title,
                        score = it.score,
                        body = it.body
                    )
                )
            }
        }
    }

    private fun parseCurrentList(fileName: String): List<RedditJokeModel>? {
        return adapter.fromJson(context.assets
            .open(fileName)
            .bufferedReader()
            .use { it.readText() })
    }

}