package com.ziad.db.repo.interfaces

import com.ziad.db.entities.JokeEntity

interface JokesRepo {
    suspend fun get(id: String): List<JokeEntity>
    suspend fun getAll(): List<JokeEntity>
    suspend fun getAllByCategory(category: String): List<JokeEntity>
    suspend fun insert(jokes: JokeEntity)
    suspend fun update(joke: JokeEntity)
    suspend fun delete(joke: JokeEntity)
}