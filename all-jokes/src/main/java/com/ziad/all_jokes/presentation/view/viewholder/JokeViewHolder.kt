package com.ziad.all_jokes.presentation.view.viewholder

import android.view.View
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.ziad.all_jokes.R
import com.ziad.all_jokes.data.models.Joke
import com.ziad.all_jokes.presentation.interfaces.FavoritesInterface
import kotlinx.android.synthetic.main.joke_item_layout.view.*

class JokeViewHolder(
    view: View,
    private val favoritesInterface: FavoritesInterface
) : RecyclerView.ViewHolder(view) {

    fun bind(joke: Joke) {
        showInfo(joke)
        checkFav(joke)
        setOnClickActions(joke)
    }

    private fun showInfo(joke: Joke) {
        itemView.tvTitle.text = joke.title
        itemView.tvBody.text = joke.body
    }

    private fun checkFav(joke: Joke) {
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

    private fun setOnClickActions(joke: Joke) {
        itemView.btnFav.setOnClickListener {
            if (joke.isFav) {
                favoritesInterface.unFav(jokeId = joke.id, position = adapterPosition)
            } else {
                favoritesInterface.fav(jokeId = joke.id, position = adapterPosition)
            }
        }
    }
}