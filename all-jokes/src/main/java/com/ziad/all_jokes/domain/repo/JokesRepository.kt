package com.ziad.all_jokes.domain.repo

import com.ziad.all_jokes.data.models.Joke

interface JokesRepository {
    suspend fun getJokes(): List<Joke>
    suspend fun favJoke(jokeId: String)
    suspend fun unFAvJoke(jokeId: String)
}