package com.ziad.favorites.presentation.adapter

import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.ziad.favorites.R
import com.ziad.favorites.data.models.FavJoke
import com.ziad.favorites.diffs.FavsJokeDiffCallback
import com.ziad.favorites.presentation.interfaces.FavoritesInterface
import com.ziad.favorites.presentation.viewholder.FavViewHolder

class FavsAdapter(private val favoritesInterface: FavoritesInterface) :
    ListAdapter<FavJoke, RecyclerView.ViewHolder>(FavsJokeDiffCallback) {

    companion object {
        const val GRID_VIEW_TYPE = 0
    }

    override fun onCreateViewHolder(
        parent: android.view.ViewGroup,
        viewType: Int
    ): RecyclerView.ViewHolder {
        val layoutInflater = android.view.LayoutInflater.from(parent.context)
        return FavViewHolder(
            layoutInflater.inflate(
                R.layout.fav_joke_item_layout,
                parent,
                false
            ),
            favoritesInterface
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is FavViewHolder) holder.bind(getItem(holder.adapterPosition))
    }

    override fun getItemViewType(position: Int): Int {
        return GRID_VIEW_TYPE
    }

}