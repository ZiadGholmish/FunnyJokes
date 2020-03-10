package com.ziad.favorites.diffs

import androidx.recyclerview.widget.DiffUtil
import com.ziad.favorites.data.models.FavJoke

object FavsJokeDiffCallback : DiffUtil.ItemCallback<FavJoke>() {

    override fun areItemsTheSame(oldItem: FavJoke, newItem: FavJoke) = oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: FavJoke, newItem: FavJoke) =
        oldItem.title == oldItem.title && oldItem.isFav == newItem.isFav
}