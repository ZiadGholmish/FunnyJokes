package com.ziad.categories.domain.usecases

import com.ziad.base.Failure
import com.ziad.base.ResultModel
import com.ziad.base.Success
import com.ziad.categories.data.models.Category
import com.ziad.categories.domain.repo.CategoriesRepo

class DeleteCategoryUseCase(private val categoriesRepo: CategoriesRepo) {
    suspend fun execute(category: Category): ResultModel<Unit> =
        categoriesRepo.delete(category = category).let { deletedCount ->
            if (deletedCount > 0) {
                Success(Unit)
            } else {
                Failure("category is not there to delete")
            }
        }
}