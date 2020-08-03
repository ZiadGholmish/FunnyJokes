package com.ziad.categories.domain.usecases

import com.ziad.categories.domain.repo.CategoriesRepo

class GetCategoryByIdUseCase(private val categoriesRepo: CategoriesRepo) {
    suspend fun execute(id: String) = categoriesRepo.get(id = id)
}