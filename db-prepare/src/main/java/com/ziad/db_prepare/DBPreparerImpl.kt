package com.ziad.db_prepare

import com.ziad.db.repo.interfaces.JokesCategoriesRepo
import com.ziad.db_prepare.populaters.RedditJokesPopulater
import com.ziad.db_prepare.populaters.StupidJokesPopulater
import com.ziad.db_prepare.populaters.WockaPopulater

class DBPreparerImpl(
    private val redditJokesPopulater: RedditJokesPopulater,
    private val wockaPopulater: WockaPopulater,
    private val stupidJokesPopulater: StupidJokesPopulater,
    private val jokesCategoriesRepo: JokesCategoriesRepo
) : DBPreparer {

    override suspend fun prepareData(): Boolean {
        redditJokesPopulater.readFileToJoson()
        return true
    }
}