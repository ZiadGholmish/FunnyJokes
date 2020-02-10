package com.ziad.db.repo.interfaces

import com.ziad.db.entities.CategoryEntity

interface JokesCategoriesRepo {
    suspend fun get(id: String): List<CategoryEntity>
    suspend fun getAll(): List<CategoryEntity>
    suspend fun insert(category: CategoryEntity)
    suspend fun update(category: CategoryEntity)
    suspend fun delete(category: CategoryEntity)
}