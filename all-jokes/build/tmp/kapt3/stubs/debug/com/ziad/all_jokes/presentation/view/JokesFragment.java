package com.ziad.all_jokes.presentation.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 12\u00020\u00012\u00020\u00022\u00020\u0003:\u00011B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0016J\b\u0010\u001a\u001a\u00020\u0014H\u0016J\b\u0010\u001b\u001a\u00020\u0014H\u0002J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J&\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u001a\u0010\'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010)\u001a\u00020\u0014H\u0002J\b\u0010*\u001a\u00020\u0014H\u0016J\u0016\u0010+\u001a\u00020\u00142\f\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-H\u0016J\b\u0010/\u001a\u00020\u0014H\u0016J\u0018\u00100\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u00062"}, d2 = {"Lcom/ziad/all_jokes/presentation/view/JokesFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/ziad/all_jokes/presentation/view/JokesController;", "Lcom/ziad/all_jokes/presentation/interfaces/FavoritesInterface;", "()V", "jokesAdapter", "Lcom/ziad/all_jokes/presentation/view/adapter/JokesAdapter;", "mPresenter", "Lcom/ziad/all_jokes/presentation/view/JokesPresenter;", "getMPresenter", "()Lcom/ziad/all_jokes/presentation/view/JokesPresenter;", "setMPresenter", "(Lcom/ziad/all_jokes/presentation/view/JokesPresenter;)V", "viewModelFactory", "Lcom/ziad/common_di/ViewModelFactory;", "getViewModelFactory", "()Lcom/ziad/common_di/ViewModelFactory;", "setViewModelFactory", "(Lcom/ziad/common_di/ViewModelFactory;)V", "fav", "", "jokeId", "", "position", "", "hideEmpty", "hideLoading", "initRecycler", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setupPresenterAndVM", "showEmpty", "showJokes", "jokes", "", "Lcom/ziad/all_jokes/data/models/Joke;", "showLoading", "unFav", "Companion", "all-jokes_debug"})
public final class JokesFragment extends androidx.fragment.app.Fragment implements com.ziad.all_jokes.presentation.view.JokesController, com.ziad.all_jokes.presentation.interfaces.FavoritesInterface {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.ziad.all_jokes.presentation.view.JokesPresenter mPresenter;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.ziad.common_di.ViewModelFactory viewModelFactory;
    private final com.ziad.all_jokes.presentation.view.adapter.JokesAdapter jokesAdapter = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG_NAME = "jokes_fragment";
    public static final com.ziad.all_jokes.presentation.view.JokesFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.ziad.all_jokes.presentation.view.JokesPresenter getMPresenter() {
        return null;
    }
    
    public final void setMPresenter(@org.jetbrains.annotations.NotNull()
    com.ziad.all_jokes.presentation.view.JokesPresenter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ziad.common_di.ViewModelFactory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.ziad.common_di.ViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupPresenterAndVM() {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private final void initRecycler() {
    }
    
    @java.lang.Override()
    public void showJokes(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ziad.all_jokes.data.models.Joke> jokes) {
    }
    
    @java.lang.Override()
    public void showEmpty() {
    }
    
    @java.lang.Override()
    public void hideEmpty() {
    }
    
    @java.lang.Override()
    public void showLoading() {
    }
    
    @java.lang.Override()
    public void hideLoading() {
    }
    
    @java.lang.Override()
    public void fav(@org.jetbrains.annotations.NotNull()
    java.lang.String jokeId, int position) {
    }
    
    @java.lang.Override()
    public void unFav(@org.jetbrains.annotations.NotNull()
    java.lang.String jokeId, int position) {
    }
    
    public JokesFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/ziad/all_jokes/presentation/view/JokesFragment$Companion;", "", "()V", "TAG_NAME", "", "newInstance", "Lcom/ziad/all_jokes/presentation/view/JokesFragment;", "category", "all-jokes_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.ziad.all_jokes.presentation.view.JokesFragment newInstance(@org.jetbrains.annotations.Nullable()
        java.lang.String category) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}