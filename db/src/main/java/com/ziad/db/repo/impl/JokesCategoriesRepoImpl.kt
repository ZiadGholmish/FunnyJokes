package com.ziad.db.repo.impl

import com.ziad.db.db.CategoryDao
import com.ziad.db.entities.CategoryEntity
import com.ziad.db.repo.interfaces.JokesCategoriesRepo

class JokesCategoriesRepoImpl(private val jokeCategoryDao: CategoryDao) : JokesCategoriesRepo {
    override suspend fun get(id: String): List<CategoryEntity> {
        return jokeCategoryDao.get(id)
    }

    override suspend fun getAll(): List<CategoryEntity> {
        return jokeCategoryDao.getAll()
    }

    override suspend fun insert(category: CategoryEntity) {
        return jokeCategoryDao.insert(category)
    }

    override suspend fun update(category: CategoryEntity): Int {
        return jokeCategoryDao.update(category)
    }

    override suspend fun delete(category: CategoryEntity): Int {
        return jokeCategoryDao.delete(category)
    }
}