package com.ziad.actions.actions

import android.content.Intent

object Actions {

    const val CATEGORY = "category"

    fun openHomeIntent() =
        internalIntent(
            "com.ziad.funnyjokes.home.open"
        )

    fun openCategoryJokes(category: String) = internalIntent("com.ziad.category_jokes.open").apply {
        putExtra(CATEGORY, category)
    }

    private fun internalIntent(action: String): Intent {
        return Intent(action)
    }

}