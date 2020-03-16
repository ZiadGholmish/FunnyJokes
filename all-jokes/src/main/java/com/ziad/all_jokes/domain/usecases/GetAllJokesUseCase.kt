package com.ziad.all_jokes.domain.usecases

import com.ziad.all_jokes.domain.repo.JokesRepository

class GetAllJokesUseCase(private val jokesRepository: JokesRepository) {
    suspend fun execute(category: String? = null) = category?.let {
        jokesRepository.getAllByCategory(it)
    } ?: jokesRepository.getJokes()

}