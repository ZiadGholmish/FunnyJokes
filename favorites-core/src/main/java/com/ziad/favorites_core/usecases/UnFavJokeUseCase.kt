package com.ziad.favorites_core.usecases

import com.ziad.favorites_core.repo.FavJokesRepository

class UnFavJokeUseCase(private val jokesRepository: FavJokesRepository) {
    suspend fun execute(jokeId: String) = jokesRepository.unFAvJoke(jokeId)
}