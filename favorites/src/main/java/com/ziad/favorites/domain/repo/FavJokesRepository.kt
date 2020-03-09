package com.ziad.favorites.domain.repo

import com.ziad.favorites.data.models.FavJoke

interface FavJokesRepository {
    suspend fun getFavs(): List<FavJoke>
    suspend fun favJoke(jokeId: String)
    suspend fun unFAvJoke(jokeId: String)
}