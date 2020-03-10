package com.ziad.favorites.domain.usecases

import com.ziad.favorites.domain.repo.FavJokesRepository


class UnFavJokeUseCase(private val jokesRepository: FavJokesRepository) {
    suspend fun execute(jokeId: String) = jokesRepository.unFAvJoke(jokeId)
}