package com.ziad.categories.di

import com.ziad.categories.data.repo.CategoriesRepoImpl
import com.ziad.categories.domain.repo.CategoriesRepo
import com.ziad.categories.domain.usecases.*
import com.ziad.common_di.FragmentScope
import com.ziad.db.repo.interfaces.JokesCategoriesRepo
import dagger.Module
import dagger.Provides

@Module
class CategoriesModule {

    @Provides
    @FragmentScope
    internal fun provideCategoriesRepo(categoriesRepo: JokesCategoriesRepo): CategoriesRepo {
        return CategoriesRepoImpl(categoriesRepo)
    }

    @Provides
    @FragmentScope
    internal fun provideGetCategoryByIdUseCase(categoriesRepo: CategoriesRepo): GetCategoryByIdUseCase {
        return GetCategoryByIdUseCase(categoriesRepo)
    }

    @Provides
    @FragmentScope
    internal fun provideAddCategoryUseCase(categoriesRepo: CategoriesRepo): AddCategoryUseCase {
        return AddCategoryUseCase(categoriesRepo)
    }

    @Provides
    @FragmentScope
    internal fun provideDeleteCategoryUseCase(categoriesRepo: CategoriesRepo): DeleteCategoryUseCase {
        return DeleteCategoryUseCase(categoriesRepo)
    }

    @Provides
    @FragmentScope
    internal fun provideGetAllCategoriesUseCase(categoriesRepo: CategoriesRepo): GetAllCategoriesUseCase {
        return GetAllCategoriesUseCase(categoriesRepo)
    }

    @Provides
    @FragmentScope
    internal fun provideUpdateCategoryUseCase(categoriesRepo: CategoriesRepo): UpdateCategoryUseCase {
        return UpdateCategoryUseCase(categoriesRepo)
    }
}