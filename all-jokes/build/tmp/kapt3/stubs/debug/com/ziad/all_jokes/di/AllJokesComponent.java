package com.ziad.all_jokes.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/ziad/all_jokes/di/AllJokesComponent;", "Lcom/ziad/all_jokes/di/AllJokesApi;", "inject", "", "jokesFragment", "Lcom/ziad/all_jokes/presentation/view/JokesFragment;", "Builder", "all-jokes_debug"})
@dagger.Component(modules = {com.ziad.all_jokes.di.AllJokesVMModule.class, com.ziad.all_jokes.di.AllJokesModule.class}, dependencies = {com.ziad.db.di.DbApi.class, com.ziad.analytics.di.AnalyticsApi.class})
@com.ziad.common_di.FragmentScope()
public abstract interface AllJokesComponent extends com.ziad.all_jokes.di.AllJokesApi {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.ziad.all_jokes.presentation.view.JokesFragment jokesFragment);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/ziad/all_jokes/di/AllJokesComponent$Builder;", "", "analyticsComponent", "Lcom/ziad/analytics/di/AnalyticsApi;", "build", "Lcom/ziad/all_jokes/di/AllJokesComponent;", "dbComponent", "Lcom/ziad/db/di/DbApi;", "all-jokes_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.ziad.all_jokes.di.AllJokesComponent.Builder dbComponent(@org.jetbrains.annotations.NotNull()
        com.ziad.db.di.DbApi dbComponent);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.ziad.all_jokes.di.AllJokesComponent.Builder analyticsComponent(@org.jetbrains.annotations.NotNull()
        com.ziad.analytics.di.AnalyticsApi analyticsComponent);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.ziad.all_jokes.di.AllJokesComponent build();
    }
}