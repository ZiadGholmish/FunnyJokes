package com.ziad.db_prepare.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RedditJokeModel(
    val body: String,
    val id: String,
    val score: Int,
    val title: String
)