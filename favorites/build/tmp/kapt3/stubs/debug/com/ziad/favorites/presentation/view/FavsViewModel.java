package com.ziad.favorites.presentation.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0015J\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u001aJ\u000e\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/ziad/favorites/presentation/view/FavsViewModel;", "Landroidx/lifecycle/ViewModel;", "favsJokesUseCase", "Lcom/ziad/favorites/domain/usecases/GetFavsJokesUseCase;", "favJokeUseCase", "Lcom/ziad/favorites/domain/usecases/FavJokeUseCase;", "unFavJokeUseCase", "Lcom/ziad/favorites/domain/usecases/UnFavJokeUseCase;", "(Lcom/ziad/favorites/domain/usecases/GetFavsJokesUseCase;Lcom/ziad/favorites/domain/usecases/FavJokeUseCase;Lcom/ziad/favorites/domain/usecases/UnFavJokeUseCase;)V", "emptyState", "Landroidx/lifecycle/MutableLiveData;", "", "getEmptyState", "()Landroidx/lifecycle/MutableLiveData;", "jokesList", "", "Lcom/ziad/favorites/data/models/FavJoke;", "requestState", "Lcom/ziad/base/RequestState;", "getRequestState", "fav", "", "jokeId", "", "getFavs", "jokes", "Landroidx/lifecycle/LiveData;", "unFav", "favorites_debug"})
public final class FavsViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.ziad.favorites.data.models.FavJoke>> jokesList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> emptyState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.ziad.base.RequestState> requestState = null;
    private final com.ziad.favorites.domain.usecases.GetFavsJokesUseCase favsJokesUseCase = null;
    private final com.ziad.favorites.domain.usecases.FavJokeUseCase favJokeUseCase = null;
    private final com.ziad.favorites.domain.usecases.UnFavJokeUseCase unFavJokeUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.ziad.favorites.data.models.FavJoke>> jokes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getEmptyState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.ziad.base.RequestState> getRequestState() {
        return null;
    }
    
    public final void getFavs() {
    }
    
    public final void fav(@org.jetbrains.annotations.NotNull()
    java.lang.String jokeId) {
    }
    
    public final void unFav(@org.jetbrains.annotations.NotNull()
    java.lang.String jokeId) {
    }
    
    @javax.inject.Inject()
    public FavsViewModel(@org.jetbrains.annotations.NotNull()
    com.ziad.favorites.domain.usecases.GetFavsJokesUseCase favsJokesUseCase, @org.jetbrains.annotations.NotNull()
    com.ziad.favorites.domain.usecases.FavJokeUseCase favJokeUseCase, @org.jetbrains.annotations.NotNull()
    com.ziad.favorites.domain.usecases.UnFavJokeUseCase unFavJokeUseCase) {
        super();
    }
}