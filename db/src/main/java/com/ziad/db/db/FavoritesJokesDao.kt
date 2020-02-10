package com.ziad.db.db

import androidx.room.*
import com.ziad.db.entities.FavoriteJokeEntity
import com.ziad.db.entities.JokeEntity

@Dao
interface FavoritesJokesDao {

    @Query("SELECT * FROM $FAVORITES_JOKES_TABLE_NAME WHERE id = :id")
    suspend fun get(id: String): List<FavoriteJokeEntity>

    @Query("SELECT * FROM $FAVORITES_JOKES_TABLE_NAME")
    suspend fun getAll(): List<FavoriteJokeEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend  fun insert(jokes: FavoriteJokeEntity)

    @Update
    suspend fun update(joke: FavoriteJokeEntity)

    @Delete
    suspend fun delete(joke: FavoriteJokeEntity)

}