package com.ziad.categories.domain.policies

import com.ziad.categories.data.models.Category

class CategoryValidator {

    fun validate(category: Category): Boolean {
        return !category.id.isBlank() && !category.title.isBlank()
    }
}