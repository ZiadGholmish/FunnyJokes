package com.ziad.favorites.di

import com.ziad.db.repo.interfaces.FavoritesJokesRepo
import com.ziad.db.repo.interfaces.JokesRepo
import com.ziad.favorites.data.repo.FavsJokesRepoImpl
import com.ziad.favorites.domain.repo.FavJokesRepository
import com.ziad.favorites.domain.usecases.FavJokeUseCase
import com.ziad.favorites.domain.usecases.GetFavsJokesUseCase
import com.ziad.favorites.domain.usecases.UnFavJokeUseCase
import dagger.Module
import dagger.Provides

@Module
class FavsJokeModule {

    @Provides
    internal fun provideJokesRepo(
        favoritesJokesRepo: FavoritesJokesRepo
    ): FavJokesRepository {
        return FavsJokesRepoImpl(favoritesJokesRepo)
    }

    @Provides
    internal fun provideFavsUseCase(favsRepo: FavJokesRepository): GetFavsJokesUseCase {
        return GetFavsJokesUseCase(favsRepo)
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