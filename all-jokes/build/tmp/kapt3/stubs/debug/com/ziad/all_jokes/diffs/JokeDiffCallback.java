package com.ziad.all_jokes.diffs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/ziad/all_jokes/diffs/JokeDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/ziad/all_jokes/data/models/Joke;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "all-jokes_debug"})
public final class JokeDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.ziad.all_jokes.data.models.Joke> {
    public static final com.ziad.all_jokes.diffs.JokeDiffCallback INSTANCE = null;
    
    @java.lang.Override()
    public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
    com.ziad.all_jokes.data.models.Joke oldItem, @org.jetbrains.annotations.NotNull()
    com.ziad.all_jokes.data.models.Joke newItem) {
        return false;
    }
    
    @java.lang.Override()
    public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
    com.ziad.all_jokes.data.models.Joke oldItem, @org.jetbrains.annotations.NotNull()
    com.ziad.all_jokes.data.models.Joke newItem) {
        return false;
    }
    
    private JokeDiffCallback() {
        super();
    }
}