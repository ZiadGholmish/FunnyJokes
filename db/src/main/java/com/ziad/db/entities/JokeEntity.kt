package com.ziad.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ziad.db.db.JOKES_TABLE_NAME
import org.jetbrains.annotations.NotNull

@Entity(tableName = JOKES_TABLE_NAME)
class JokeEntity(
    @NotNull
    @PrimaryKey val id: String,
    val title: String,
    val score: Int,
    val body: String,
    val category: String? = null
)