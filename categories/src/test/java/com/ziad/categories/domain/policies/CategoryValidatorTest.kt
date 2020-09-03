package com.ziad.categories.domain.policies

import com.ziad.categories.data.models.Category
import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.runners.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class CategoryValidatorTest {

    private val validCategory = Category("1", "title", "")
    private val inValidCategoryWithoutId = Category("", "dummyTitle", "")
    private val inValidCategoryWithoutTitle = Category("id", "", "")
    private val inValidCategoryWithoutIdAndTitle = Category("", "", "")
    private val validator = CategoryValidator()

    @Test
    fun `validate with valid category item then should return true`() {
        assertTrue(validator.validate(validCategory))
    }

    @Test
    fun `validate with invalid category without id item then should return false`() {
        assertFalse(validator.validate(inValidCategoryWithoutId))
    }

    @Test
    fun `validate with invalid category without title item then should return false`() {
        assertFalse(validator.validate(inValidCategoryWithoutTitle))
    }

    @Test
    fun `validate with invalid category without title and id item then should return false`() {
        assertFalse(validator.validate(inValidCategoryWithoutIdAndTitle))
    }
}
