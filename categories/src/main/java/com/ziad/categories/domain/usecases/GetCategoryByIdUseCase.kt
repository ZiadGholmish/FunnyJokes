package com.ziad.categories.domain.usecases

import com.ziad.base.Failure
import com.ziad.base.ResultModel
import com.ziad.base.Success
import com.ziad.categories.data.models.Category
import com.ziad.categories.domain.repo.CategoriesRepo

class GetCategoryByIdUseCase(private val categoriesRepo: CategoriesRepo) {
    suspend fun execute(id: String): ResultModel<Category> {
        categoriesRepo.get(id = id).let { categories ->
            return if (categories.isNotEmpty()) {
                Success(categories[0])
            } else {
                Failure("There is no category for this $id")
            }
        }
    }
}