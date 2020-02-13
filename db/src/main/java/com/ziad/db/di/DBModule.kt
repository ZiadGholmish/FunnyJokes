package com.ziad.db.di

import androidx.room.Room
import android.content.Context
import com.ziad.common_di.ModuleScope
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

@Module
class DBModule(private val context: Context) {


    @Provides
    fun providesDatabase(): JokesDB = Room.databaseBuilder(
        context,
        JokesDB::class.java, JOKES_DATABASE_NAME
    )
        .fallbackToDestructiveMigration().build()


    @Provides
    fun providesJokesCategoriesDao(database: JokesDB) = database.categoryDao()


    @Provides
    fun providesJokesDao(database: JokesDB) = database.jokesDao()


    @Provides
    fun providesFavoriesDao(database: JokesDB) = database.favoriesJokesDao()


    @Provides
    fun provideJokeCategoriesRepo(jokesCategoryDao: CategoryDao): JokesCategoriesRepo {
        return JokesCategoriesRepoImpl(jokesCategoryDao)
    }


    @Provides
    fun provideJokesRepo(jokesDao: JokesDao): JokesRepo {
        return JokesRepoImpl(jokesDao)
    }


    @Provides
    fun provideFAvoritesJokesRepo(favoritesJokesDao: FavoritesJokesDao): FavoritesJokesRepo {
        return FavoritesJokesRepoImpl(favoritesJokesDao)
    }

}