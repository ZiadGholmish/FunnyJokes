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
class GetCategoryByIdUseCaseTest {

    @Mock
    private lateinit var categoriesRepo: CategoriesRepo
    private val availableCategory = Category("1", "title", "")
    private val getCategoryByIdUseCase: GetCategoryByIdUseCase by lazy {
        GetCategoryByIdUseCase(
            categoriesRepo = categoriesRepo
        )
    }

    @ExperimentalCoroutinesApi
    @Test
    fun `execute()  with available id return success with the first item`() {
        runBlockingTest {
            Mockito.`when`(categoriesRepo.get(id = "1")).thenReturn(listOf(availableCategory))
            val result = getCategoryByIdUseCase.execute("1")
            Assert.assertEquals(result, Success(availableCategory))

        }
    }

    @ExperimentalCoroutinesApi
    @Test
    fun `execute() with unavailable id return Failure`() {
        runBlockingTest {
            Mockito.`when`(categoriesRepo.get(id = "2")).thenReturn(listOf())
            val result = getCategoryByIdUseCase.execute("2")
            Assert.assertEquals(result, Failure("There is no category for this 2"))

        }
    }


}