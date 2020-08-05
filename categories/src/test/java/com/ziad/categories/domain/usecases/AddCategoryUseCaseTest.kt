package com.ziad.categories.domain.usecases

import com.ziad.base.Failure
import com.ziad.base.Success
import com.ziad.categories.data.models.Category
import com.ziad.categories.domain.policies.CategoryValidator
import com.ziad.categories.domain.repo.CategoriesRepo
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Test
import org.junit.Assert.assertEquals

import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.runners.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class AddCategoryUseCaseTest {

    @Mock
    private lateinit var categoriesRepo: CategoriesRepo
    private val validCategory = Category("1", "title", "")
    private val inValidCategoryWithoutId = Category("", "dummyTitle", "")
    private val inValidCategoryWithoutTitle = Category("id", "", "")
    private val inValidCategoryWithoutIdAndTitle = Category("", "", "")
    private val validator = CategoryValidator()
    private val addCategoryUseCase: AddCategoryUseCase by lazy {
        AddCategoryUseCase(
            categoriesRepo = categoriesRepo,
            categoryValidator = validator
        )
    }

    @ExperimentalCoroutinesApi
    @Test
    fun `save category with valid category item then should return success`() {
        runBlockingTest {
            `when`(categoriesRepo.insert(category = validCategory)).thenReturn(Unit)
            val result = addCategoryUseCase.execute(category = validCategory)
            assertEquals(result, Success(Unit))
        }
    }

    @ExperimentalCoroutinesApi
    @Test
    fun `save category with in valid category without id item then should return failure`() {
        runBlockingTest {
            val result = addCategoryUseCase.execute(inValidCategoryWithoutId)
            assertEquals(result, Failure("Category is not valid"))
        }
    }

    @ExperimentalCoroutinesApi
    @Test
    fun `save category with in valid category without title item then should return failure`() {
        runBlockingTest {
            val result = addCategoryUseCase.execute(inValidCategoryWithoutTitle)
            assertEquals(result, Failure("Category is not valid"))
        }
    }

    @ExperimentalCoroutinesApi
    @Test
    fun `save category with in valid category without id and title item then should return failure`() {
        runBlockingTest {
            val result = addCategoryUseCase.execute(inValidCategoryWithoutIdAndTitle)
            assertEquals(result, Failure("Category is not valid"))
        }
    }

}