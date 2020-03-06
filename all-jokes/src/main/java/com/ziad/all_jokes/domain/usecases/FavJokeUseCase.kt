package com.ziad.all_jokes.domain.usecases

import com.ziad.all_jokes.domain.repo.JokesRepository

class FavJokeUseCase(private val jokesRepository: JokesRepository) {
    suspend fun execute(jokeId: String) = jokesRepository.favJoke(jokeId)
}