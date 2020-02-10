package com.ziad.db.repo.impl

import com.ziad.db.db.FavoritesJokesDao
import com.ziad.db.entities.FavoriteJokeEntity
import com.ziad.db.repo.interfaces.FavoritesJokesRepo

class FavoritesJokesRepoImpl constructor(private val favoritesJokesDao: FavoritesJokesDao) :
    FavoritesJokesRepo {
    override suspend fun get(id: String): List<FavoriteJokeEntity> {
        return favoritesJokesDao.get(id)
    }

    override suspend fun getAll(): List<FavoriteJokeEntity> {
        return favoritesJokesDao.getAll()
    }

    override suspend fun insert(jokes: FavoriteJokeEntity) {
        return favoritesJokesDao.insert(jokes)
    }

    override suspend fun update(joke: FavoriteJokeEntity) {
        return favoritesJokesDao.update(joke)
    }

    override suspend fun delete(joke: FavoriteJokeEntity) {
        favoritesJokesDao.delete(joke)
    }
}