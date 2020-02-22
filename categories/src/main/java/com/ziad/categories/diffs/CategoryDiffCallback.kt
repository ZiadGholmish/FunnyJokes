package com.ziad.categories.diffs

import androidx.recyclerview.widget.DiffUtil
import com.ziad.categories.data.models.Category

object CategoryDiffCallback : DiffUtil.ItemCallback<Category>() {

    override fun areItemsTheSame(oldItem: Category, newItem: Category) = oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: Category, newItem: Category) =
        oldItem.title == oldItem.title


}