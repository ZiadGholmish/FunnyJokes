package com.ziad.favorites.data.models

import com.ziad.db.entities.JokeEntity

data class FavJoke(
    val id: String,
    val title: String? = null,
    val score: Int,
    val body: String? = null,
    val category: String? = null,
    val isFav: Boolean
)

internal fun JokeEntity.toFav(): FavJoke {
    return FavJoke(
        id = id,
        title = title,
        score = score,
        body = body,
        category = category,
        isFav = isFav
    )
}

