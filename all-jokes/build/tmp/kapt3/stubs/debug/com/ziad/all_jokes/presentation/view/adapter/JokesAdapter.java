package com.ziad.all_jokes.presentation.view.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/ziad/all_jokes/presentation/view/adapter/JokesAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/ziad/all_jokes/data/models/Joke;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "favoritesInterface", "Lcom/ziad/all_jokes/presentation/interfaces/FavoritesInterface;", "(Lcom/ziad/all_jokes/presentation/interfaces/FavoritesInterface;)V", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "all-jokes_debug"})
public final class JokesAdapter extends androidx.recyclerview.widget.ListAdapter<com.ziad.all_jokes.data.models.Joke, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final com.ziad.all_jokes.presentation.interfaces.FavoritesInterface favoritesInterface = null;
    public static final int GRID_VIEW_TYPE = 0;
    public static final com.ziad.all_jokes.presentation.view.adapter.JokesAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    public JokesAdapter(@org.jetbrains.annotations.NotNull()
    com.ziad.all_jokes.presentation.interfaces.FavoritesInterface favoritesInterface) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/ziad/all_jokes/presentation/view/adapter/JokesAdapter$Companion;", "", "()V", "GRID_VIEW_TYPE", "", "all-jokes_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}