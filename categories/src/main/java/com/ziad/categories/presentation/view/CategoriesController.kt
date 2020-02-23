package com.ziad.categories.presentation.view

import androidx.lifecycle.LifecycleOwner
import com.ziad.categories.data.models.Category

interface CategoriesController : LifecycleOwner {

    fun showCategories(categories: List<Category>)
    fun showEmpty()
    fun hideEmpty()
    fun showLoading()
    fun hideLoading()

}