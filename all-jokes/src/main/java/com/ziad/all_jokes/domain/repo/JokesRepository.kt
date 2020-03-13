package com.ziad.all_jokes.domain.repo

import com.ziad.all_jokes.data.models.Joke

interface JokesRepository {
    suspend fun getJokes(): List<Joke>
}