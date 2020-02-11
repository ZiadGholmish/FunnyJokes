package com.ziad.db.di

import android.app.Application
import com.ziad.common_di.ModuleScope
import com.ziad.db.repo.interfaces.FavoritesJokesRepo
import com.ziad.db.repo.interfaces.JokesCategoriesRepo
import com.ziad.db.repo.interfaces.JokesRepo
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import javax.inject.Singleton

@Singleton
@Component(modules = [DBModule::class])
interface DBComponent : DbApi {


    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun localDataModule(dbModule: DBModule): Builder

        fun build(): DBComponent
    }
}