package com.ziad.all_jokes.presentation.view

import androidx.lifecycle.LifecycleOwner
import com.ziad.all_jokes.data.models.Joke

interface JokesController : LifecycleOwner{

    fun showJokes(jokes: List<Joke>)
    fun showEmpty()
    fun hideEmpty()
    fun showLoading()
    fun hideLoading()
}