package com.ziad.db.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ziad.db.entities.CategoryEntity
import com.ziad.db.entities.FavoriteJokeEntity
import com.ziad.db.entities.JokeEntity

const val JOKES_CATEGORIES_TABLE_NAME = "jokes_categories"
const val FAVORITES_JOKES_TABLE_NAME = "favorites_jokes"
const val JOKES_TABLE_NAME = "jokes"
internal const val JOKES_DATABASE_NAME = "circle_db"

@Database(
    entities = [CategoryEntity::class, JokeEntity::class, FavoriteJokeEntity::class],
    version = 1,
    exportSchema = false
)
abstract class JokesDB : RoomDatabase() {
    abstract fun categoryDao(): CategoryDao
    abstract fun jokesDao(): JokesDao
    abstract fun favoriesJokesDao(): FavoritesJokesDao
}