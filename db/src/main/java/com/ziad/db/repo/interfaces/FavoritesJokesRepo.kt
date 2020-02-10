package com.ziad.db.repo.interfaces

import com.ziad.db.entities.FavoriteJokeEntity

interface FavoritesJokesRepo {
    suspend fun get(id: String): List<FavoriteJokeEntity>
    suspend fun getAll(): List<FavoriteJokeEntity>
    suspend fun insert(jokes: FavoriteJokeEntity)
    suspend fun update(joke: FavoriteJokeEntity)
    suspend fun delete(joke: FavoriteJokeEntity)
}