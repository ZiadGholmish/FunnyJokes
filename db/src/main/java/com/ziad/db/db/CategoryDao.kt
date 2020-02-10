package com.ziad.db.db

import androidx.room.*
import com.ziad.db.entities.CategoryEntity

@Dao
interface CategoryDao {

    @Query("SELECT * FROM $JOKES_CATEGORIES_TABLE_NAME WHERE id = :id")
    suspend fun get(id: String): List<CategoryEntity>

    @Query("SELECT * FROM $JOKES_CATEGORIES_TABLE_NAME")
    suspend fun getAll(): List<CategoryEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(category: CategoryEntity)

    @Update
    suspend fun update(category: CategoryEntity)

    @Delete
    suspend fun delete(category: CategoryEntity)

}