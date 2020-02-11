package com.ziad.db.di

import com.ziad.db.repo.interfaces.FavoritesJokesRepo
import com.ziad.db.repo.interfaces.JokesCategoriesRepo
import com.ziad.db.repo.interfaces.JokesRepo

interface DbApi {
    fun favoritesJokesRepo(): FavoritesJokesRepo
    fun jokesRepo(): JokesRepo
    fun jokesCategoriesRepo(): JokesCategoriesRepo

}