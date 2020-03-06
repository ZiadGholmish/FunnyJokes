package com.ziad.all_jokes.presentation.view.adapter

import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.ziad.all_jokes.R
import com.ziad.all_jokes.data.models.Joke
import com.ziad.all_jokes.diffs.JokeDiffCallback
import com.ziad.all_jokes.presentation.interfaces.FavoritesInterface
import com.ziad.all_jokes.presentation.view.viewholder.JokeViewHolder

class JokesAdapter(private val favoritesInterface: FavoritesInterface) :
    ListAdapter<Joke, RecyclerView.ViewHolder>(JokeDiffCallback) {

    companion object {
        const val GRID_VIEW_TYPE = 0
    }

    override fun onCreateViewHolder(
        parent: android.view.ViewGroup,
        viewType: Int
    ): RecyclerView.ViewHolder {
        val layoutInflater = android.view.LayoutInflater.from(parent.context)
        return JokeViewHolder(
            layoutInflater.inflate(
                R.layout.joke_item_layout,
                parent,
                false
            ),
            favoritesInterface
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is JokeViewHolder) holder.bind(getItem(holder.adapterPosition))
    }

    override fun getItemViewType(position: Int): Int {
        return GRID_VIEW_TYPE
    }

}