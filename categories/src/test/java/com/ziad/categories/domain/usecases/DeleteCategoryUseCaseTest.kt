package com.ziad.categories.domain.usecases

import com.nhaarman.mockitokotlin2.doReturn
import com.nhaarman.mockitokotlin2.mock
import com.ziad.base.Success
import com.ziad.categories.data.models.Category
import com.ziad.categories.domain.repo.CategoriesRepo
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Assert.assertEquals
import org.junit.Test

import org.mockito.Mockito
import org.mockito.Mockito.times

class DeleteCategoryUseCaseTest {


    private val categoriesRepo: CategoriesRepo = mock {
        on { runBlocking { delete(category = category) } } doReturn 1
    }
    private val category = Category("1", "title", "")
    private val deleteCategoryUseCase: DeleteCategoryUseCase by lazy {
        DeleteCategoryUseCase(
            categoriesRepo = categoriesRepo
        )
    }

    @ExperimentalCoroutinesApi
    @Test
    fun `delete category should call delete method in repo`() {
        runBlockingTest {
            Mockito.`when`(categoriesRepo.delete(category = category)).thenReturn(1)
            deleteCategoryUseCase.execute(category = category)
            Mockito.verify(categoriesRepo, times(1)).delete(category = category)
        }
    }

    @ExperimentalCoroutinesApi
    @Test
    fun `delete with valid category should return success`() {
        runBlockingTest {
            val result = deleteCategoryUseCase.execute(category = category)
            assertEquals(result, Success(Unit))
        }
    }


}