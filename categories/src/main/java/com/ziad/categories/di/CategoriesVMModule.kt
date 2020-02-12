package com.ziad.categories.di

import androidx.lifecycle.ViewModel
import com.ziad.categories.presentation.CategoriesVM
import com.ziad.common_di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class CategoriesVMModule {

    @Binds
    @IntoMap
    @ViewModelKey(CategoriesVM::class)
     abstract fun categoriesVM(categoriesVM: CategoriesVM): ViewModel
}
