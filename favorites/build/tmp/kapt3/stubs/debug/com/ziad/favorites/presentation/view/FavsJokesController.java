package com.ziad.favorites.presentation.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\b\u0010\n\u001a\u00020\u0003H&\u00a8\u0006\u000b"}, d2 = {"Lcom/ziad/favorites/presentation/view/FavsJokesController;", "Landroidx/lifecycle/LifecycleOwner;", "hideEmpty", "", "hideLoading", "showEmpty", "showJokes", "jokes", "", "Lcom/ziad/favorites/data/models/FavJoke;", "showLoading", "favorites_debug"})
public abstract interface FavsJokesController extends androidx.lifecycle.LifecycleOwner {
    
    public abstract void showJokes(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ziad.favorites.data.models.FavJoke> jokes);
    
    public abstract void showEmpty();
    
    public abstract void hideEmpty();
    
    public abstract void showLoading();
    
    public abstract void hideLoading();
}