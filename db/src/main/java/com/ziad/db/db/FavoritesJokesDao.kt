package com.ziad.db.db

import androidx.room.*
import com.ziad.db.entities.JokeEntity

@Dao
interface FavoritesJokesDao {

    @Query("SELECT * FROM $JOKES_TABLE_NAME WHERE isFav = 1")
    suspend fun getAll(): List<JokeEntity>

    @Query("UPDATE $JOKES_TABLE_NAME SET isFav =1 WHERE id = :jokeId")
    suspend fun fav(jokeId: String)

    @Query("UPDATE $JOKES_TABLE_NAME SET isFav =0 WHERE id = :jokeId")
    suspend fun unFav(jokeId: String)
}