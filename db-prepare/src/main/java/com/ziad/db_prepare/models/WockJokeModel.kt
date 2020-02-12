package com.ziad.db_prepare.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class WockJokeModel(
    val body: String,
    val category: String,
    val id: String,
    val title: String
)