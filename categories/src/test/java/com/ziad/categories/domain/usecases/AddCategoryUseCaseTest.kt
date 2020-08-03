package com.ziad.categories.domain.usecases

import com.ziad.categories.data.models.Category
import com.ziad.categories.domain.repo.CategoriesRepo
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Test

import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.times
import org.mockito.Mockito.verify
import org.mockito.runners.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class AddCategoryUseCaseTest {

    @Mock
    private lateinit var categoriesRepo: CategoriesRepo
    private val category = Category("", "", "")
    private val addCategoryUseCase: AddCategoryUseCase by lazy { AddCategoryUseCase(categoriesRepo = categoriesRepo) }

    @ExperimentalCoroutinesApi
    @Test
    fun execute() {
        runBlockingTest {
            Mockito.`when`(categoriesRepo.insert(category = category)).thenReturn(Unit)
            addCategoryUseCase.execute(category)
            verify(categoriesRepo, times(1)).insert(category = category)
        }
    }
}