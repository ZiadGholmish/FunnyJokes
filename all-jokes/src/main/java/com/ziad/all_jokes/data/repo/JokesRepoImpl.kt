package com.ziad.all_jokes.data.repo

import com.ziad.all_jokes.data.models.Joke
import com.ziad.all_jokes.data.models.toJoke
import com.ziad.all_jokes.domain.repo.JokesRepository
import com.ziad.db.repo.interfaces.FavoritesJokesRepo
import com.ziad.db.repo.interfaces.JokesRepo

class JokesRepoImpl(
    private val jokesRepo: JokesRepo,
    private val favoritesJokesRepo: FavoritesJokesRepo
) :
    JokesRepository {
    override suspend fun getJokes(): List<Joke> {
        return jokesRepo.getAll().map { it.toJoke() }
    }

    override suspend fun favJoke(jokeId: String) {
        favoritesJokesRepo.fav(jokeId)
    }

    override suspend fun unFAvJoke(jokeId: String) {
        favoritesJokesRepo.unFAv(jokeId)
    }
}