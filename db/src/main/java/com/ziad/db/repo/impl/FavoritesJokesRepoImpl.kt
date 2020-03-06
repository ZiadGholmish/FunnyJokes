package com.ziad.db.repo.impl

import com.ziad.db.db.FavoritesJokesDao
import com.ziad.db.entities.JokeEntity
import com.ziad.db.repo.interfaces.FavoritesJokesRepo

class FavoritesJokesRepoImpl constructor(private val favoritesJokesDao: FavoritesJokesDao) :
    FavoritesJokesRepo {

    override suspend fun getAll(): List<JokeEntity> {
        return favoritesJokesDao.getAll()
    }

    override suspend fun fav(jokeId: String) {
        return favoritesJokesDao.fav(jokeId)
    }

    override suspend fun unFAv(jokeId: String) {
        favoritesJokesDao.unFav(jokeId)
    }
}