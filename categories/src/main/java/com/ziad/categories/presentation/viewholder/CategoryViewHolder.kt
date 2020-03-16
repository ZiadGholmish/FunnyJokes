package com.ziad.categories.presentation.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.ziad.actions.actions.Actions
import com.ziad.categories.data.models.Category
import kotlinx.android.synthetic.main.category_item_layout.view.*

class CategoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    fun bind(category: Category) {
        itemView.tvCategoryTitle.text = category.title
        itemView.setOnClickListener {
            itemView.context.startActivity(Actions.openCategoryJokes(category = category.id))
        }
    }
}