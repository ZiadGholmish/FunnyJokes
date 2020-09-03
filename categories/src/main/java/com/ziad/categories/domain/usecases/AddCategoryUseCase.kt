package com.ziad.categories.domain.usecases

import com.ziad.base.Failure
import com.ziad.base.ResultModel
import com.ziad.base.Success
import com.ziad.categories.data.models.Category
import com.ziad.categories.domain.policies.CategoryValidator
import com.ziad.categories.domain.repo.CategoriesRepo

class AddCategoryUseCase(
    private val categoriesRepo: CategoriesRepo,
    private val categoryValidator: CategoryValidator
) {

    suspend fun execute(category: Category): ResultModel<Unit> =
        if (categoryValidator.validate(category = category)) {
            Success(categoriesRepo.insert(category = category))
        } else {
            Failure("Category is not valid")
        }
}
 