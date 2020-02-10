package com.ziad.categories.domain.usecases

import com.ziad.categories.domain.repo.CategoriesRepo

class GetCategoryByIdUseCase(private val categoriesRepo: CategoriesRepo) {
    suspend fun excute(id: String) = categoriesRepo.get(id = id)
}