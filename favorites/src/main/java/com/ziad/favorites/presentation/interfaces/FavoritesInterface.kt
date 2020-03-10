package com.ziad.favorites.presentation.interfaces

interface FavoritesInterface {
    fun fav(jokeId: String, position: Int)
    fun unFav(jokeId: String, position: Int)
}