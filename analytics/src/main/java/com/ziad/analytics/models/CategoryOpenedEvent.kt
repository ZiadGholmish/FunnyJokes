package com.ziad.analytics.models

import android.os.Bundle

data class CategoryOpenedEvent(
    val name: String,
    val id: String
)

fun CategoryOpenedEvent.toBundle(): Bundle {
    return Bundle().apply {
        putString("name", name)
        putString("id", id)
    }
}