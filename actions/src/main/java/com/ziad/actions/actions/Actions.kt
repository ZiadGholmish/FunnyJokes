package com.ziad.actions.actions

import android.content.Intent

object Actions {

    const val CATEGORY = "category"
    const val CATEGORY_NAME = "category_name"

    fun openHomeIntent() =
        internalIntent(
            "com.ziad.funnyjokes.home.open"
        )

    fun openCategoryJokes(category: String, categoryName: String) =
        internalIntent("com.ziad.category_jokes.open").apply {
            putExtra(CATEGORY, category)
            putExtra(CATEGORY_NAME, categoryName)
        }

    private fun internalIntent(action: String): Intent {
        return Intent(action)
    }

}