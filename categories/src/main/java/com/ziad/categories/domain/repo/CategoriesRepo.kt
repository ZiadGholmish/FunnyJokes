package com.ziad.categories.domain.repo

import com.ziad.categories.data.models.Category

interface CategoriesRepo {
    suspend fun get(id: String): List<Category>
    suspend fun getAll(): List<Category>
    suspend fun insert(category: Category)
    suspend fun update(category: Category): Int
    suspend fun delete(category: Category): Int
}