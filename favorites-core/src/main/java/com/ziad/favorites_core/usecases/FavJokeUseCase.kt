package com.ziad.favorites_core.usecases

import com.ziad.favorites_core.repo.FavJokesRepository

class FavJokeUseCase(private val jokesRepository: FavJokesRepository) {
    suspend fun execute(jokeId: String) = jokesRepository.favJoke(jokeId)
}