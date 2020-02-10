package com.ziad.analytics.models

import android.os.Bundle

data class FavoriteJokeEvent(
    val jokeTitle: String,
    val jokeId: String,
    val jokeBody: String,
    val jokeCategory: String
)

fun FavoriteJokeEvent.toBundle(): Bundle {
    return Bundle().apply {
        putString("jokeTitle", jokeTitle)
        putString("jokeId", jokeId)
        putString("jokeBody", jokeBody)
        putString("jokeCategory", jokeCategory)
    }
}