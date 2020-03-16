package com.ziad.db.db

import androidx.room.*
import com.ziad.db.entities.JokeEntity

@Dao
interface JokesDao {

    @Query("SELECT * FROM $JOKES_TABLE_NAME WHERE id = :id")
    suspend fun get(id: String): List<JokeEntity>

    @Query("SELECT * FROM $JOKES_TABLE_NAME")
    suspend fun getAll(): List<JokeEntity>

    @Query("SELECT * FROM $JOKES_TABLE_NAME WHERE category = :category")
    suspend fun getAllByCategory(category: String): List<JokeEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(jokes: JokeEntity)

    @Update
    suspend fun update(joke: JokeEntity)

    @Delete
    suspend fun delete(joke: JokeEntity)

}