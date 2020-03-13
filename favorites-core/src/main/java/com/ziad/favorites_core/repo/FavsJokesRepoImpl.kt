package com.ziad.favorites_core.repo

import com.ziad.db.repo.interfaces.FavoritesJokesRepo
import com.ziad.favorites_core.repo.FavJokesRepository

class FavsJokesRepoImpl(
    private val favoritesJokesRepo: FavoritesJokesRepo
) : FavJokesRepository {

    override suspend fun favJoke(jokeId: String) {
        favoritesJokesRepo.fav(jokeId)
    }

    override suspend fun unFAvJoke(jokeId: String) {
        favoritesJokesRepo.unFAv(jokeId)
    }
}