package com.ziad.favorites.domain.usecases

import com.ziad.favorites.domain.repo.FavJokesRepository

class GetFavsJokesUseCase(private val jokesRepository: FavJokesRepository) {
    suspend fun execute() = jokesRepository.getFavs()
}