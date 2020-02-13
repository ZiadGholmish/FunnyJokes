package com.ziad.db_prepare.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class StupidStuffJokeModel(
    val body: String,
    val category: String,
    val id: String,
    val rating: Double
)