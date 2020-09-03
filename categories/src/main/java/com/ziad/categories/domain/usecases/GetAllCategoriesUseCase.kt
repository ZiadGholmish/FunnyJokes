package com.ziad.categories.domain.usecases

import com.ziad.base.ResultModel
import com.ziad.base.Success
import com.ziad.categories.data.models.Category
import com.ziad.categories.domain.repo.CategoriesRepo

class GetAllCategoriesUseCase(private val categoriesRepo: CategoriesRepo) {
    suspend fun execute(): ResultModel<List<Category>> = Success(categoriesRepo.getAll())
}

