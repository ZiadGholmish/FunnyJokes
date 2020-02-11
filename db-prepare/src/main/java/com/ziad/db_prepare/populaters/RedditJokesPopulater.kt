package com.ziad.db_prepare.populaters

import android.content.Context
import android.util.Log
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
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
    private val jokesreRepo: JokesRepo,
    private val jokesCategoriesRepo: JokesCategoriesRepo,
    private val context: Context
) {

    val moshi = Moshi.Builder().build()

    val listType = Types.newParameterizedType(List::class.java, RedditJokeModel::class.java)
    val adapter: JsonAdapter<List<RedditJokeModel>> = moshi.adapter(listType)

    fun readFileToJoson() {
        kotlin.runCatching {
            val jsonString =
                context.assets
                    .open("reddit_jokes_1.json")
                    .bufferedReader()
                    .use { it.readText() }

            val result = adapter.fromJson(jsonString)

            //now save the jokes

            MainScope().launch {
                withContext(Dispatchers.IO) {
                    result?.forEach {
                        jokesreRepo.insert(
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

            //check if the data is saved
            MainScope().launch {
                withContext(Dispatchers.IO) {
                 val list =    jokesreRepo.getAll()
                    Log.e("Jokes saved" , list.size.toString())
                }
            }


        }.getOrElse {
            it.printStackTrace()
        }
    }

}