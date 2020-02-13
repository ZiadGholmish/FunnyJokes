package com.ziad.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ziad.db.db.JOKES_CATEGORIES_TABLE_NAME
import org.jetbrains.annotations.NotNull

@Entity(tableName = JOKES_CATEGORIES_TABLE_NAME)
class CategoryEntity(
    @NotNull
    @PrimaryKey val id: String,
    val name: String,
    val icon: String? = null
)