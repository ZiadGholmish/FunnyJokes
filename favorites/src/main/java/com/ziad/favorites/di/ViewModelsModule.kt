package com.ziad.favorites.di

import androidx.lifecycle.ViewModel
import com.ziad.common_di.ViewModelKey
import com.ziad.favorites.presentation.view.FavsViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(FavsViewModel::class)
    abstract fun favsViewModel(favsViewModel: FavsViewModel): ViewModel
}
