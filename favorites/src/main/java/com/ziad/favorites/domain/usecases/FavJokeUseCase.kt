package com.ziad.favorites.domain.usecases

 import com.ziad.favorites.domain.repo.FavJokesRepository

class FavJokeUseCase(private val jokesRepository: FavJokesRepository) {
    suspend fun execute(jokeId: String) = jokesRepository.favJoke(jokeId)
}