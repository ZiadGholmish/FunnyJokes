package com.ziad.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ziad.db.db.JOKES_TABLE_NAME

@Entity(tableName = JOKES_TABLE_NAME)
class JokeEntity(
    @PrimaryKey val id: String,
    val title: String,
    val score: Int,
    val body: String
)