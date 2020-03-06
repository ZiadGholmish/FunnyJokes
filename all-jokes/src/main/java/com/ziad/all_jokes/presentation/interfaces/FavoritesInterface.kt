package com.ziad.all_jokes.presentation.interfaces

interface FavoritesInterface {
    fun fav(jokeId: String, position: Int)
    fun unFav(jokeId: String, position: Int)
}