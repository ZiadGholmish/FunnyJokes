package com.ziad.db_prepare.di

import android.content.Context
import com.ziad.common_di.ActivityScoped
import com.ziad.db.repo.interfaces.JokesCategoriesRepo
import com.ziad.db.repo.interfaces.JokesRepo
import com.ziad.db_prepare.DBPreparer
import com.ziad.db_prepare.DBPreparerImpl
import com.ziad.db_prepare.populaters.RedditJokesPopulater
import com.ziad.db_prepare.populaters.StupidJokesPopulater
import com.ziad.db_prepare.populaters.WockaPopulater
import dagger.Module
import dagger.Provides

@Module
class DBPrepareModule(private val context: Context) {

    @Provides
    @ActivityScoped
    internal fun provideDBPreparer(
        redditJokesPopulater: RedditJokesPopulater,
        wockaPopulater: WockaPopulater,
        stupidJokesPopulater: StupidJokesPopulater
    ): DBPreparer {
        return DBPreparerImpl(
            redditJokesPopulater,
            wockaPopulater,
            stupidJokesPopulater
        )
    }

    @Provides
    @ActivityScoped
    internal fun provideRedditJokesPopulater(
        jokesreRepo: JokesRepo
    ): RedditJokesPopulater {
        return RedditJokesPopulater(
            jokesreRepo,
            context
        )
    }

    @Provides
    @ActivityScoped
    internal fun provideStupidJokesPopulater(
        jokesRepo: JokesRepo,
        jokesCategoriesRepo: JokesCategoriesRepo
    ): StupidJokesPopulater {
        return StupidJokesPopulater(
            jokesRepo,
            jokesCategoriesRepo,
            context
        )
    }

    @Provides
    @ActivityScoped
    internal fun provideWockaPopulater(
        jokesreRepo: JokesRepo,
        jokesCategoriesRepo: JokesCategoriesRepo
    ): WockaPopulater {
        return WockaPopulater(
            jokesreRepo,
            jokesCategoriesRepo,
            context
        )
    }

}