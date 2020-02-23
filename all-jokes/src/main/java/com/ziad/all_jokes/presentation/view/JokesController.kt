package com.ziad.all_jokes.presentation.view

import com.ziad.all_jokes.data.models.Joke

interface JokesController{

    fun showJokes(jokes: List<Joke>)
    fun showEmpty()
    fun hideEmpty()
    fun showLoading()
    fun hideLoading()
}