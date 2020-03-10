package com.ziad.favorites.data.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/ziad/favorites/data/repo/FavsJokesRepoImpl;", "Lcom/ziad/favorites/domain/repo/FavJokesRepository;", "favoritesJokesRepo", "Lcom/ziad/db/repo/interfaces/FavoritesJokesRepo;", "(Lcom/ziad/db/repo/interfaces/FavoritesJokesRepo;)V", "favJoke", "", "jokeId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavs", "", "Lcom/ziad/favorites/data/models/FavJoke;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unFAvJoke", "favorites_debug"})
public final class FavsJokesRepoImpl implements com.ziad.favorites.domain.repo.FavJokesRepository {
    private final com.ziad.db.repo.interfaces.FavoritesJokesRepo favoritesJokesRepo = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getFavs(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.ziad.favorites.data.models.FavJoke>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object favJoke(@org.jetbrains.annotations.NotNull()
    java.lang.String jokeId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object unFAvJoke(@org.jetbrains.annotations.NotNull()
    java.lang.String jokeId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public FavsJokesRepoImpl(@org.jetbrains.annotations.NotNull()
    com.ziad.db.repo.interfaces.FavoritesJokesRepo favoritesJokesRepo) {
        super();
    }
}