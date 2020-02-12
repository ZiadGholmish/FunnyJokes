package com.ziad.categories.data.models

import com.ziad.db.entities.CategoryEntity

data class Category(
    val id: String,
    val title: String,
    val icon: String?
)

internal fun CategoryEntity.toCategory(): Category {
    return Category(
        id = id,
        title = name,
        icon = icon
    )
}

internal fun Category.toEntity(): CategoryEntity {
    return CategoryEntity(
        id = id,
        name = title,
        icon = icon
    )
}