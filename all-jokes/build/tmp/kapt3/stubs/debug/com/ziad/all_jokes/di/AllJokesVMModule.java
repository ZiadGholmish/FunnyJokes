package com.ziad.all_jokes.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/ziad/all_jokes/di/AllJokesVMModule;", "", "()V", "jokesVM", "Landroidx/lifecycle/ViewModel;", "Lcom/ziad/all_jokes/presentation/view/JokesVM;", "all-jokes_debug"})
@dagger.Module()
public abstract class AllJokesVMModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.ziad.common_di.ViewModelKey(value = com.ziad.all_jokes.presentation.view.JokesVM.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel jokesVM(@org.jetbrains.annotations.NotNull()
    com.ziad.all_jokes.presentation.view.JokesVM jokesVM);
    
    public AllJokesVMModule() {
        super();
    }
}