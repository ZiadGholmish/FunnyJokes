package com.ziad.favorites.presentation.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.ziad.favorites.R
import com.ziad.favorites.data.models.FavJoke
import com.ziad.favorites.presentation.interfaces.FavoritesInterface
import kotlinx.android.synthetic.main.fav_joke_item_layout.view.*

class FavViewHolder(
    view: View,
    private val favoritesInterface: FavoritesInterface
) : RecyclerView.ViewHolder(view) {

    fun bind(joke: FavJoke) {
        showInfo(joke)
        checkFav(joke)
        setOnClickActions(joke)
    }

    private fun showInfo(joke: FavJoke) {
        itemView.tvTitle.text = joke.title
        itemView.tvBody.text = joke.body
    }

    private fun checkFav(joke: FavJoke) {
        if (joke.isFav) {
            itemView.btnFav.setImageResource(
                R.drawable.ic_favorite_border_selected_24px
            )
        } else {
            itemView.btnFav.setImageResource(
                R.drawable.ic_favorite_border_24px
            )
        }
    }

    private fun setOnClickActions(joke: FavJoke) {
        itemView.btnFav.setOnClickListener {
            if (joke.isFav) {
                favoritesInterface.unFav(jokeId = joke.id, position = adapterPosition)
            } else {
                favoritesInterface.fav(jokeId = joke.id, position = adapterPosition)
            }
        }
    }
}