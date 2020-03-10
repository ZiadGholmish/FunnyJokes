package com.ziad.db.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ziad.db.entities.CategoryEntity
import com.ziad.db.entities.JokeEntity

const val JOKES_CATEGORIES_TABLE_NAME = "jokes_categories"
 const val JOKES_TABLE_NAME = "jokes"
internal const val JOKES_DATABASE_NAME = "circle_db"

@Database(
    entities = [CategoryEntity::class, JokeEntity::class],
    version = 2,
    exportSchema = false
)
abstract class JokesDB : RoomDatabase() {
    abstract fun categoryDao(): CategoryDao
    abstract fun jokesDao(): JokesDao
    abstract fun favoriesJokesDao(): FavoritesJokesDao
}