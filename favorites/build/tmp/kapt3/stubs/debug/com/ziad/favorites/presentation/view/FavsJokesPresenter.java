package com.ziad.favorites.presentation.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\fJ\b\u0010\u0010\u001a\u00020\fH\u0016J\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR(\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0012"}, d2 = {"Lcom/ziad/favorites/presentation/view/FavsJokesPresenter;", "Lcom/ziad/base/AbsPresenter;", "Lcom/ziad/favorites/presentation/view/FavsJokesController;", "()V", "value", "Lcom/ziad/favorites/presentation/view/FavsViewModel;", "favsVM", "getFavsVM", "()Lcom/ziad/favorites/presentation/view/FavsViewModel;", "setFavsVM", "(Lcom/ziad/favorites/presentation/view/FavsViewModel;)V", "fav", "", "jokeId", "", "getJokes", "setObservers", "unFav", "favorites_debug"})
public final class FavsJokesPresenter extends com.ziad.base.AbsPresenter<com.ziad.favorites.presentation.view.FavsJokesController> {
    @org.jetbrains.annotations.Nullable()
    private com.ziad.favorites.presentation.view.FavsViewModel favsVM;
    
    @org.jetbrains.annotations.Nullable()
    public final com.ziad.favorites.presentation.view.FavsViewModel getFavsVM() {
        return null;
    }
    
    public final void setFavsVM(@org.jetbrains.annotations.Nullable()
    com.ziad.favorites.presentation.view.FavsViewModel value) {
    }
    
    public final void getJokes() {
    }
    
    @java.lang.Override()
    public void setObservers() {
    }
    
    public final void fav(@org.jetbrains.annotations.NotNull()
    java.lang.String jokeId) {
    }
    
    public final void unFav(@org.jetbrains.annotations.NotNull()
    java.lang.String jokeId) {
    }
    
    @javax.inject.Inject()
    public FavsJokesPresenter() {
        super();
    }
}