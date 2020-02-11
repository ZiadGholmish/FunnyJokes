package com.ziad.db_prepare.populaters

import android.content.Context
import com.ziad.db.repo.interfaces.JokesCategoriesRepo
import com.ziad.db.repo.interfaces.JokesRepo
import com.ziad.db_prepare.models.RedditJokeModel
import java.io.IOException
import javax.inject.Inject
import javax.inject.Singleton

class RedditJokesPopulater(
    private val jokesreRepo: JokesRepo,
    private val jokesCategoriesRepo: JokesCategoriesRepo,
    private val context: Context
) {

    fun readFileToJoson(): List<RedditJokeModel> {
        kotlin.runCatching {
            var jsonString: String? = null
            try {
                jsonString =
                    context.assets.open("reddit_jokes.json").bufferedReader().use { it.readText() }
            } catch (ioException: IOException) {
                ioException.printStackTrace()
                return listOf()
            }
            return listOf()
        }.getOrElse {
            return listOf()
        }
    }

}