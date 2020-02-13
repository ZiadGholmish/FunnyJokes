package com.ziad.categories.data.repo

import com.ziad.categories.data.models.Category
import com.ziad.categories.data.models.toCategory
import com.ziad.categories.data.models.toEntity
import com.ziad.categories.domain.repo.CategoriesRepo
import com.ziad.db.repo.interfaces.JokesCategoriesRepo

class CategoriesRepoImpl(private val categoriesRepo: JokesCategoriesRepo) : CategoriesRepo {
    override suspend fun get(id: String): List<Category> {
        return categoriesRepo.get(id).map { it.toCategory() }
    }

    override suspend fun getAll(): List<Category> {
        return categoriesRepo.getAll().map { it.toCategory() }
    }

    override suspend fun insert(category: Category) {
        return categoriesRepo.insert(category = category.toEntity())
    }

    override suspend fun update(category: Category) {
        return categoriesRepo.update(category = category.toEntity())
    }

    override suspend fun delete(category: Category) {
        return categoriesRepo.delete(category = category.toEntity())
    }
}