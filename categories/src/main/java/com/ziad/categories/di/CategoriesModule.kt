package com.ziad.categories.di

import com.ziad.categories.data.repo.CategoriesRepoImpl
import com.ziad.categories.domain.repo.CategoriesRepo
import com.ziad.categories.domain.usecases.*
import com.ziad.db.repo.interfaces.JokesCategoriesRepo
import dagger.Module
import dagger.Provides

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
    internal fun provideAddCategoryUseCase(categoriesRepo: CategoriesRepo): AddCategoryUseCase {
        return AddCategoryUseCase(categoriesRepo)
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
}