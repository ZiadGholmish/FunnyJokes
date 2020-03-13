package com.ziad.favorites.di

import com.ziad.db.repo.interfaces.FavoritesJokesRepo
import com.ziad.favorites.data.repo.FavsJokesRepoImpl
import com.ziad.favorites.domain.repo.FavJokesRepository
import com.ziad.favorites.domain.usecases.GetFavsJokesUseCase
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

}