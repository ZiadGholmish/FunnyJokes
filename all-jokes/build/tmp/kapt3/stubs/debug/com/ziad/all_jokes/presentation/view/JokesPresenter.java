package com.ziad.all_jokes.presentation.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\fH\u0016J\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR(\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0012"}, d2 = {"Lcom/ziad/all_jokes/presentation/view/JokesPresenter;", "Lcom/ziad/base/AbsPresenter;", "Lcom/ziad/all_jokes/presentation/view/JokesController;", "()V", "value", "Lcom/ziad/all_jokes/presentation/view/JokesVM;", "jokesVM", "getJokesVM", "()Lcom/ziad/all_jokes/presentation/view/JokesVM;", "setJokesVM", "(Lcom/ziad/all_jokes/presentation/view/JokesVM;)V", "fav", "", "jokeId", "", "getJokes", "setObservers", "unFav", "all-jokes_debug"})
public final class JokesPresenter extends com.ziad.base.AbsPresenter<com.ziad.all_jokes.presentation.view.JokesController> {
    @org.jetbrains.annotations.Nullable()
    private com.ziad.all_jokes.presentation.view.JokesVM jokesVM;
    
    @org.jetbrains.annotations.Nullable()
    public final com.ziad.all_jokes.presentation.view.JokesVM getJokesVM() {
        return null;
    }
    
    public final void setJokesVM(@org.jetbrains.annotations.Nullable()
    com.ziad.all_jokes.presentation.view.JokesVM value) {
    }
    
    private final void getJokes() {
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
    public JokesPresenter() {
        super();
    }
}