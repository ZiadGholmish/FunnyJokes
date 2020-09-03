package com.ziad.categories.domain.usecases

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
class GetAllCategoriesUseCaseTest {

    @Mock
    private lateinit var categoriesRepo: CategoriesRepo
    private val getAllCategory: GetAllCategoriesUseCase by lazy {
        GetAllCategoriesUseCase(
            categoriesRepo = categoriesRepo
        )
    }

    @ExperimentalCoroutinesApi
    @Test
    fun `getAll()  should call getAll method in repo`() {
        runBlockingTest {
            Mockito.`when`(categoriesRepo.getAll()).thenReturn(listOf())
            getAllCategory.execute()
            Mockito.verify(categoriesRepo, Mockito.times(1)).getAll()
        }
    }

    @ExperimentalCoroutinesApi
    @Test
    fun `getAll() should return success`() {
        runBlockingTest {
            Mockito.`when`(categoriesRepo.getAll()).thenReturn(listOf())
            val result = getAllCategory.execute()
            Assert.assertEquals(result, Success(listOf<Category>()))
        }
    }
}