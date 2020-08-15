package com.ziad.categories.domain.usecases

import com.ziad.base.Failure
import com.ziad.base.Success
import com.ziad.categories.data.models.Category
import com.ziad.categories.domain.repo.CategoriesRepo
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock

import org.mockito.Mockito
import org.mockito.Mockito.times
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class DeleteCategoryUseCaseTest {

    @Mock
    private lateinit var categoriesRepo: CategoriesRepo
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
            Mockito.`when`(categoriesRepo.delete(category = category)).thenReturn(1)
            val result = deleteCategoryUseCase.execute(category = category)
            assertEquals(result, Success(Unit))
        }
    }

    @ExperimentalCoroutinesApi
    @Test
    fun `delete with invalid category should return failure`() {
        runBlockingTest {
            Mockito.`when`(categoriesRepo.delete(category = category)).thenReturn(0)
            val result = deleteCategoryUseCase.execute(category = category)
            assertEquals(result, Failure("category is not there to delete"))
        }
    }


}