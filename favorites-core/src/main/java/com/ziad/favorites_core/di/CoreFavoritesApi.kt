package com.ziad.favorites_core.di

import com.ziad.favorites_core.usecases.FavJokeUseCase
import com.ziad.favorites_core.usecases.UnFavJokeUseCase

interface CoreFavoritesApi {
    fun favUseCase(): FavJokeUseCase
    fun unFavUseCase(): UnFavJokeUseCase
}