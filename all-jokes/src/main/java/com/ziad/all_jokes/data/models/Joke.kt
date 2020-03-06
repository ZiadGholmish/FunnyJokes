package com.ziad.all_jokes.data.models

import com.ziad.db.entities.JokeEntity

data class Joke(
    val id: String,
    val title: String? = null,
    val score: Int,
    val body: String? = null,
    val category: String? = null,
    val isFav: Boolean
)

internal fun JokeEntity.toJoke(): Joke {
    return Joke(
        id = id,
        title = title,
        score = score,
        body = body,
        category = category,
        isFav = isFav
    )
}

