package com.ziad.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ziad.db.db.JOKES_CATEGORIES_TABLE_NAME

@Entity(tableName = JOKES_CATEGORIES_TABLE_NAME)
class CategoryEntity(
    @PrimaryKey val id: Long,
    val name: String
)