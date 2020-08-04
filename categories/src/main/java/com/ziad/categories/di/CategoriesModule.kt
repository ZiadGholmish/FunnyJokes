package com.ziad.categories.di

import com.ziad.categories.data.models.Category
import com.ziad.categories.data.repo.CategoriesRepoImpl
import com.ziad.categories.domain.policies.CategoryValidator
import com.ziad.categories.domain.repo.CategoriesRepo
import com.ziad.categories.domain.usecases.*
import com.ziad.db.repo.interfaces.JokesCategoriesRepo
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CategoriesModule {

    @Provides
    internal fun provideCategoriesRepo(categoriesRepo: JokesCategoriesRepo): CategoriesRepo {
        return CategoriesRepoImpl(categoriesRepo)
    }

    @Provides
    internal fun provideGetCategoryByIdUseCase(categoriesRepo: CategoriesRepo): GetCategoryByIdUseCase {
        return GetCategoryByIdUseCase(categoriesRepo)
    }

    @Provides
    internal fun provideAddCategoryUseCase(
        categoriesRepo: CategoriesRepo,
        validator: CategoryValidator
    ): AddCategoryUseCase {
        return AddCategoryUseCase(categoriesRepo = categoriesRepo, categoryValidator = validator)
    }

    @Provides
    internal fun provideDeleteCategoryUseCase(categoriesRepo: CategoriesRepo): DeleteCategoryUseCase {
        return DeleteCategoryUseCase(categoriesRepo)
    }

    @Provides
    internal fun provideGetAllCategoriesUseCase(categoriesRepo: CategoriesRepo): GetAllCategoriesUseCase {
        return GetAllCategoriesUseCase(categoriesRepo)
    }

    @Provides
    internal fun provideUpdateCategoryUseCase(categoriesRepo: CategoriesRepo): UpdateCategoryUseCase {
        return UpdateCategoryUseCase(categoriesRepo)
    }

    @Singleton
    @Provides
    internal fun provideCategoryValidator(): CategoryValidator {
        return CategoryValidator()
    }
}