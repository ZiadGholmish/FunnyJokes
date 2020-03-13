package com.ziad.favorites.data.repo

import com.ziad.db.repo.interfaces.FavoritesJokesRepo
import com.ziad.favorites.data.models.FavJoke
import com.ziad.favorites.data.models.toFav
import com.ziad.favorites.domain.repo.FavJokesRepository

class FavsJokesRepoImpl(
    private val favoritesJokesRepo: FavoritesJokesRepo
) : FavJokesRepository {

    override suspend fun getFavs(): List<FavJoke> {
        return favoritesJokesRepo.getAll().map { it.toFav() }
    }
}