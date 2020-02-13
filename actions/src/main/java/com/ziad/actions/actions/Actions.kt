package com.ziad.actions.actions

import android.content.Context
import android.content.Intent
import android.util.Log

object Actions {
    fun openHomeIntent(context: Context? = null) =
        internalIntent(
            context,
            "com.ziad.funnyjokes.home.open"
        )

    private fun internalIntent(context: Context?, action: String): Intent {
        return Intent(action)
    }

}