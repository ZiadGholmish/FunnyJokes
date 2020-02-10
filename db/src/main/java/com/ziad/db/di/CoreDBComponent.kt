package com.ziad.db.di

import android.app.Application
import com.ziad.db.repo.interfaces.FavoritesJokesRepo
import com.ziad.db.repo.interfaces.JokesCategoriesRepo
import com.ziad.db.repo.interfaces.JokesRepo
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [LocalDataModule::class])
interface CoreDBComponent {

    fun favoriesJokesRepo(): FavoritesJokesRepo
    fun jokesRepo(): JokesRepo
    fun jokesCategoriesRepo(): JokesCategoriesRepo

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun localDataModule(localDataModule: LocalDataModule): Builder

        fun build(): CoreDBComponent
    }
}