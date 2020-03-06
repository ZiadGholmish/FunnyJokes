package com.ziad.all_jokes.domain.usecases

import com.ziad.all_jokes.domain.repo.JokesRepository

class UnFavJokeUseCase(private val jokesRepository: JokesRepository) {
    suspend fun execute(jokeId: String) = jokesRepository.unFAvJoke(jokeId)
}