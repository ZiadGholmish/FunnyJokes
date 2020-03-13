package com.ziad.favorites_core.di

import com.ziad.db.repo.interfaces.FavoritesJokesRepo
import com.ziad.favorites_core.repo.FavJokesRepository
import com.ziad.favorites_core.repo.FavsJokesRepoImpl
import com.ziad.favorites_core.usecases.FavJokeUseCase
import com.ziad.favorites_core.usecases.UnFavJokeUseCase
import dagger.Module
import dagger.Provides

@Module
class CoreFavoritesJokeModule {

    @Provides
    internal fun provideJokesRepo(
        favoritesJokesRepo: FavoritesJokesRepo
    ): FavJokesRepository {
        return FavsJokesRepoImpl(favoritesJokesRepo)
    }

    @Provides
    internal fun provideFavJoke(favsRepo: FavJokesRepository): FavJokeUseCase {
        return FavJokeUseCase(favsRepo)
    }

    @Provides
    internal fun provideUnFavJoke(favsRepo: FavJokesRepository): UnFavJokeUseCase {
        return UnFavJokeUseCase(favsRepo)
    }
}