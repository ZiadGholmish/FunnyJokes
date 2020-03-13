package com.ziad.favorites_core.repo

interface FavJokesRepository {
    suspend fun favJoke(jokeId: String)
    suspend fun unFAvJoke(jokeId: String)
}