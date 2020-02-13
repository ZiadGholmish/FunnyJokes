package com.ziad.db_prepare

import com.ziad.db_prepare.populaters.RedditJokesPopulater
import com.ziad.db_prepare.populaters.StupidJokesPopulater
import com.ziad.db_prepare.populaters.WockaPopulater

class DBPreparerImpl(
    private val redditJokesPopulater: RedditJokesPopulater,
    private val wockaPopulater: WockaPopulater,
    private val stupidJokesPopulater: StupidJokesPopulater
) : DBPreparer {

    override suspend fun prepareData(): Boolean {
        redditJokesPopulater.validateJokes()
        stupidJokesPopulater.validateJokes()
        wockaPopulater.validateJokes()
        return true
    }
}