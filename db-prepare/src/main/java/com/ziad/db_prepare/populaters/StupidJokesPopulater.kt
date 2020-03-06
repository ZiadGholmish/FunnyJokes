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
import com.ziad.db_prepare.models.StupidStuffJokeModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class StupidJokesPopulater(
    private val jokesRepo: JokesRepo,
    private val categoriesRepo: JokesCategoriesRepo,
    private val context: Context
) {

    companion object {
        private const val SAMPLE_JOKE_ID = "1"
    }

    private val fileNames = listOf("stupidstuff.json")

    private val moshi by lazy { Moshi.Builder().build() }

    private val listType by lazy {
        Types.newParameterizedType(
            List::class.java,
            StupidStuffJokeModel::class.java
        )
    }
    private val adapter: JsonAdapter<List<StupidStuffJokeModel>> = moshi.adapter(listType)

    suspend fun validateJokes() {
        if (isJokesSaved()) return
        saveData()
    }

    private suspend fun isJokesSaved() = withContext(Dispatchers.IO) {
        return@withContext jokesRepo.get(SAMPLE_JOKE_ID).isNullOrEmpty().not()
    }

    private suspend fun saveData() {
        kotlin.runCatching {
            fileNames.forEach { fileName ->
                val jokesResult = parseCurrentList(fileName)
                saveJokes(jokesResult)
                saveCategories(jokesResult)
            }
        }.getOrElse {
            it.printStackTrace()
        }
    }

    private suspend fun saveJokes(jokes: List<StupidStuffJokeModel>?) {
        withContext(Dispatchers.IO) {
            jokes?.forEach {
                jokesRepo.insert(
                    JokeEntity(
                        id = it.id,
                        score = it.rating.toInt(),
                        body = it.body,
                        category = it.category ,
                        isFav = false
                    )
                )
            }
        }
    }

    private suspend fun saveCategories(jokes: List<StupidStuffJokeModel>?) {
        withContext(Dispatchers.IO) {
            jokes?.forEach {
                categoriesRepo.insert(
                    CategoryEntity(
                        id = it.category,
                        name = it.category
                    )
                )
            }
        }
    }

    private fun parseCurrentList(fileName: String): List<StupidStuffJokeModel>? {
        return adapter.fromJson(context.assets
            .open(fileName)
            .bufferedReader()
            .use { it.readText() })
    }

}