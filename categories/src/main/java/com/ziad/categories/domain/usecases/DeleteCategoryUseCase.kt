package com.ziad.categories.domain.usecases

import com.ziad.categories.data.models.Category
import com.ziad.categories.domain.repo.CategoriesRepo

class DeleteCategoryUseCase(private val categoriesRepo: CategoriesRepo) {
    suspend fun excute(category: Category) = categoriesRepo.delete(category = category)
}