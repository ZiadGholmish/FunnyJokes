package com.ziad.analytics.models

import android.os.Bundle

data class ScreenOpenedEvent(
    val screenName: String
)

fun ScreenOpenedEvent.toBundle(): Bundle {
    return Bundle().apply {
        putString("screenName", screenName)
    }
}