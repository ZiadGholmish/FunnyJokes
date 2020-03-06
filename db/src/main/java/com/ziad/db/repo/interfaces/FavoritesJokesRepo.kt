package com.ziad.db.repo.interfaces

import com.ziad.db.entities.JokeEntity

interface FavoritesJokesRepo {
    suspend fun getAll(): List<JokeEntity>
    suspend fun fav(jokeId: String)
    suspend fun unFAv(jokeId: String)
}