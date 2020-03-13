package com.ziad.favorites.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0001\u00a2\u0006\u0002\b\u000b\u00a8\u0006\f"}, d2 = {"Lcom/ziad/favorites/di/FavsJokeModule;", "", "()V", "provideFavsUseCase", "Lcom/ziad/favorites/domain/usecases/GetFavsJokesUseCase;", "favsRepo", "Lcom/ziad/favorites/domain/repo/FavJokesRepository;", "provideFavsUseCase$favorites_debug", "provideJokesRepo", "favoritesJokesRepo", "Lcom/ziad/db/repo/interfaces/FavoritesJokesRepo;", "provideJokesRepo$favorites_debug", "favorites_debug"})
@dagger.Module()
public final class FavsJokeModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.ziad.favorites.domain.repo.FavJokesRepository provideJokesRepo$favorites_debug(@org.jetbrains.annotations.NotNull()
    com.ziad.db.repo.interfaces.FavoritesJokesRepo favoritesJokesRepo) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.ziad.favorites.domain.usecases.GetFavsJokesUseCase provideFavsUseCase$favorites_debug(@org.jetbrains.annotations.NotNull()
    com.ziad.favorites.domain.repo.FavJokesRepository favsRepo) {
        return null;
    }
    
    public FavsJokeModule() {
        super();
    }
}