package com.ziad.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ziad.db.db.FAVORITES_JOKES_TABLE_NAME

@Entity(tableName = FAVORITES_JOKES_TABLE_NAME)
class FavoriteJokeEntity(
    @PrimaryKey val id: String,
    val title: String,
    val score: Int,
    val body: String
)