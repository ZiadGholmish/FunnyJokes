package com.ziad.categories.domain.usecases

import com.ziad.base.Failure
import com.ziad.base.Success
import com.ziad.categories.data.models.Category
import com.ziad.categories.domain.repo.CategoriesRepo
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class UpdateCategoryUseCaseTest {

    @Mock
    private lateinit var categoriesRepo: CategoriesRepo
    private val category = Category("1", "title", "")
    private val updateCategoryUseCase: UpdateCategoryUseCase by lazy {
        UpdateCategoryUseCase(
            categoriesRepo = categoriesRepo
        )
    }

    @ExperimentalCoroutinesApi
    @Test
    fun `execute() with available category item then should return success`() {
        runBlockingTest {
            Mockito.`when`(categoriesRepo.update(category = category)).thenReturn(1)
            val result = updateCategoryUseCase.execute(category = category)
            Assert.assertEquals(result, Success(Unit))
        }
    }

    @ExperimentalCoroutinesApi
    @Test
    fun `execute() with unavailable category item then should return Failure`() {
        runBlockingTest {
            Mockito.`when`(categoriesRepo.update(category = category)).thenReturn(0)
            val result = updateCategoryUseCase.execute(category = category)
            Assert.assertEquals(result, Failure("There is no activity available to update"))
        }
    }
}