package com.ziad.all_jokes.data.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/ziad/all_jokes/data/repo/JokesRepoImpl;", "Lcom/ziad/all_jokes/domain/repo/JokesRepository;", "jokesRepo", "Lcom/ziad/db/repo/interfaces/JokesRepo;", "favoritesJokesRepo", "Lcom/ziad/db/repo/interfaces/FavoritesJokesRepo;", "(Lcom/ziad/db/repo/interfaces/JokesRepo;Lcom/ziad/db/repo/interfaces/FavoritesJokesRepo;)V", "favJoke", "", "jokeId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getJokes", "", "Lcom/ziad/all_jokes/data/models/Joke;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unFAvJoke", "all-jokes_debug"})
public final class JokesRepoImpl implements com.ziad.all_jokes.domain.repo.JokesRepository {
    private final com.ziad.db.repo.interfaces.JokesRepo jokesRepo = null;
    private final com.ziad.db.repo.interfaces.FavoritesJokesRepo favoritesJokesRepo = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getJokes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.ziad.all_jokes.data.models.Joke>> p0) {
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
    
    public JokesRepoImpl(@org.jetbrains.annotations.NotNull()
    com.ziad.db.repo.interfaces.JokesRepo jokesRepo, @org.jetbrains.annotations.NotNull()
    com.ziad.db.repo.interfaces.FavoritesJokesRepo favoritesJokesRepo) {
        super();
    }
}