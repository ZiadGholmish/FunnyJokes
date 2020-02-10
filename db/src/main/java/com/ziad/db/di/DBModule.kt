package com.ziad.db.di

import androidx.room.Room
import android.content.Context
import com.ziad.db.db.*
import com.ziad.db.db.JOKES_DATABASE_NAME
import com.ziad.db.repo.impl.FavoritesJokesRepoImpl
import com.ziad.db.repo.impl.JokesCategoriesRepoImpl
import com.ziad.db.repo.impl.JokesRepoImpl
import com.ziad.db.repo.interfaces.FavoritesJokesRepo
import com.ziad.db.repo.interfaces.JokesCategoriesRepo
import com.ziad.db.repo.interfaces.JokesRepo
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DBModule(private val context: Context) {

    @Singleton
    @Provides
    fun providesDatabase(): JokesDB = Room.databaseBuilder(
        context,
        JokesDB::class.java, JOKES_DATABASE_NAME
    )
        .fallbackToDestructiveMigration().build()

    @Singleton
    @Provides
    fun providesJokesCategoriesDao(database: JokesDB) = database.categoryDao()

    @Singleton
    @Provides
    fun providesJokesDao(database: JokesDB) = database.jokesDao()

    @Singleton
    @Provides
    fun providesFavoriesDao(database: JokesDB) = database.favoriesJokesDao()

    @Singleton
    @Provides
    fun provideJokeCategoriesRepo(jokesCategoryDao: CategoryDao): JokesCategoriesRepo {
        return JokesCategoriesRepoImpl(jokesCategoryDao)
    }

    @Singleton
    @Provides
    fun provideJokesRepo(jokesDao: JokesDao): JokesRepo {
        return JokesRepoImpl(jokesDao)
    }

    @Singleton
    @Provides
    fun provideFAvoritesJokesRepo(favoritesJokesDao: FavoritesJokesDao): FavoritesJokesRepo {
        return FavoritesJokesRepoImpl(favoritesJokesDao)
    }

}