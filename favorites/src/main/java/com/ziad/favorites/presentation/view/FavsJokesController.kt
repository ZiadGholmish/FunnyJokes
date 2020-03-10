package com.ziad.favorites.presentation.view

import androidx.lifecycle.LifecycleOwner
import com.ziad.favorites.data.models.FavJoke

interface FavsJokesController : LifecycleOwner {
    fun showJokes(jokes: List<FavJoke>)
    fun showEmpty()
    fun hideEmpty()
    fun showLoading()
    fun hideLoading()
}