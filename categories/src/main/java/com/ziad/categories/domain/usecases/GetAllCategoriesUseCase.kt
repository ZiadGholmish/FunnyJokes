package com.ziad.categories.domain.usecases

import com.ziad.categories.domain.repo.CategoriesRepo

class GetAllCategoriesUseCase(private val categoriesRepo: CategoriesRepo) {
    suspend fun execute() = categoriesRepo.getAll()
}