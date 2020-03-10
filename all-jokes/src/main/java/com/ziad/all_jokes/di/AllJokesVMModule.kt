package com.ziad.all_jokes.di

import androidx.lifecycle.ViewModel
import com.ziad.all_jokes.presentation.view.JokesVM
import com.ziad.common_di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class AllJokesVMModule {

    @Binds
    @IntoMap
    @ViewModelKey(JokesVM::class)
    abstract fun jokesVM(jokesVM:JokesVM): ViewModel
}
