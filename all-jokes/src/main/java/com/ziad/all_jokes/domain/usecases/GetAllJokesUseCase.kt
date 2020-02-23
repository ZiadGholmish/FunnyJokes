package com.ziad.all_jokes.domain.usecases

import com.ziad.all_jokes.domain.repo.JokesRepository

class GetAllJokesUseCase(private val jokesRepository: JokesRepository) {
    suspend fun execute() = jokesRepository.getJokes()
}