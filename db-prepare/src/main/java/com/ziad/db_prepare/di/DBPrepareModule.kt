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
        stupidJokesPopulater: StupidJokesPopulater,
        jokesCategoriesRepo: JokesCategoriesRepo
    ): DBPreparer {
        return DBPreparerImpl(
            redditJokesPopulater,
            wockaPopulater,
            stupidJokesPopulater,
            jokesCategoriesRepo
        )
    }

    @Provides
    @ActivityScoped
    internal fun provideRedditJokesPopulater(
        jokesreRepo: JokesRepo,
        jokesCategoriesRepo: JokesCategoriesRepo
    ): RedditJokesPopulater {
        return RedditJokesPopulater(
            jokesreRepo,
            jokesCategoriesRepo,
            context
        )
    }

    @Provides
    @ActivityScoped
    internal fun provideStupidJokesPopulater(
        jokesreRepo: JokesRepo,
        jokesCategoriesRepo: JokesCategoriesRepo
    ): StupidJokesPopulater {
        return StupidJokesPopulater(
            jokesreRepo,
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