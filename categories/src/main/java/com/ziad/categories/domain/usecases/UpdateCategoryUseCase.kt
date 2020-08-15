package com.ziad.categories.domain.usecases

import com.ziad.base.Failure
import com.ziad.base.ResultModel
import com.ziad.base.Success
import com.ziad.categories.data.models.Category
import com.ziad.categories.domain.repo.CategoriesRepo

class UpdateCategoryUseCase(private val categoriesRepo: CategoriesRepo) {
    suspend fun execute(category: Category): ResultModel<Unit> {
        categoriesRepo.update(category = category).let { count ->
            return if (count > 0) {
                Success(Unit)
            } else {
                Failure("There is no activity available to update")
            }
        }
    }
}