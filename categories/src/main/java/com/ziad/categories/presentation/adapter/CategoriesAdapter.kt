package com.ziad.categories.presentation.adapter

import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.ziad.categories.R
import com.ziad.categories.data.models.Category
import com.ziad.categories.diffs.CategoryDiffCallback
import com.ziad.categories.presentation.viewholder.CategoryViewHolder

class CategoriesAdapter : ListAdapter<Category, RecyclerView.ViewHolder>(CategoryDiffCallback) {

    companion object {
        const val GRID_VIEW_TYPE = 0
    }

    override fun onCreateViewHolder(
        parent: android.view.ViewGroup,
        viewType: Int
    ): RecyclerView.ViewHolder {
        val layoutInflater = android.view.LayoutInflater.from(parent.context)
        return CategoryViewHolder(
            layoutInflater.inflate(
                R.layout.category_item_layout,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is CategoryViewHolder) holder.bind(getItem(holder.adapterPosition))
    }

    override fun getItemViewType(position: Int): Int {
        return GRID_VIEW_TYPE
    }

}