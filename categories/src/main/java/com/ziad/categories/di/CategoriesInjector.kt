package com.ziad.categories.di

import com.ziad.injector.ComponentInjector
import java.lang.IllegalStateException

object CategoriesInjector {

    var categoriesComponent: CategoriesComponent? = null
        get() {
            if (field == null)
                throw IllegalStateException("categories component should be initialized first")
            return field
        }
        private set

    fun initCategoriesConponent() {
        categoriesComponent =
            DaggerCategoriesComponent
                .builder()
                .analyticsComponent(ComponentInjector.analyticComponent!!)
                .dbComponent(ComponentInjector.dbComponent!!)
                .build()
    }

}