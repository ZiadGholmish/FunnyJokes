package com.ziad.all_jokes.presentation.view.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.ziad.all_jokes.data.models.Joke
import kotlinx.android.synthetic.main.joke_item_layout.view.*

class JokeViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    fun bind(joke: Joke) {
        itemView.tvTitle.text = joke.title
        itemView.tvBody.text = joke.body
    }
}