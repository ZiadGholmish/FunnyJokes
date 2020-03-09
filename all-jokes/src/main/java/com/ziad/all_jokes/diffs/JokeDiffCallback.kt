package com.ziad.all_jokes.diffs

import androidx.recyclerview.widget.DiffUtil
import com.ziad.all_jokes.data.models.Joke

object JokeDiffCallback : DiffUtil.ItemCallback<Joke>() {

    override fun areItemsTheSame(oldItem: Joke, newItem: Joke) = oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: Joke, newItem: Joke) =
        oldItem.title == oldItem.title && oldItem.isFav == newItem.isFav
}