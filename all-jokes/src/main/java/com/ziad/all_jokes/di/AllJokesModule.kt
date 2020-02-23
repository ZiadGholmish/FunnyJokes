package com.ziad.all_jokes.di

import com.ziad.all_jokes.data.repo.JokesRepoImpl
import com.ziad.all_jokes.domain.repo.JokesRepository
import com.ziad.all_jokes.domain.usecases.GetAllJokesUseCase
import com.ziad.db.repo.interfaces.JokesRepo
import dagger.Module
import dagger.Provides

@Module
class AllJokesModule {

    @Provides
    internal fun provideJokesRepo(jokesRepo: JokesRepo): JokesRepository {
        return JokesRepoImpl(jokesRepo)
    }

    @Provides
    internal fun provideGetAllJokes(jokeRepo: JokesRepository): GetAllJokesUseCase {
        return GetAllJokesUseCase(jokeRepo)
    }

}