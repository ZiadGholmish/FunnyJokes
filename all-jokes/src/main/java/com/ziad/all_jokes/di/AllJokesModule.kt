package com.ziad.all_jokes.di

import com.ziad.all_jokes.data.repo.JokesRepoImpl
import com.ziad.all_jokes.domain.repo.JokesRepository
import com.ziad.all_jokes.domain.usecases.FavJokeUseCase
import com.ziad.all_jokes.domain.usecases.GetAllJokesUseCase
import com.ziad.all_jokes.domain.usecases.UnFavJokeUseCase
import com.ziad.db.repo.interfaces.FavoritesJokesRepo
import com.ziad.db.repo.interfaces.JokesRepo
import dagger.Module
import dagger.Provides

@Module
class AllJokesModule {

    @Provides
    internal fun provideJokesRepo(
        jokesRepo: JokesRepo,
        favoritesJokesRepo: FavoritesJokesRepo
    ): JokesRepository {
        return JokesRepoImpl(jokesRepo, favoritesJokesRepo)
    }

    @Provides
    internal fun provideGetAllJokes(jokeRepo: JokesRepository): GetAllJokesUseCase {
        return GetAllJokesUseCase(jokeRepo)
    }

    @Provides
    internal fun provideFavJoke(jokeRepo: JokesRepository): FavJokeUseCase {
        return FavJokeUseCase(jokeRepo)
    }

    @Provides
    internal fun provideUnFavJoke(jokeRepo: JokesRepository): UnFavJokeUseCase {
        return UnFavJokeUseCase(jokeRepo)
    }
}