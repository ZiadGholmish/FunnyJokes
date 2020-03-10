package com.ziad.favorites.di

import com.ziad.injector.ComponentInjector
import java.lang.IllegalStateException

object FavsInjector {
    var favsJokesComponent: FavsJokesComponent? = null
        get() {
            if (field == null)
                throw IllegalStateException("Favs Jokes component should be initialized first")
            return field
        }
        private set

    fun initFavoritesComponent() {
        favsJokesComponent =
            DaggerFavsJokesComponent
                .builder()
                .analyticsComponent(ComponentInjector.analyticComponent!!)
                .dbComponent(ComponentInjector.dbComponent!!)
                .build()
    }
}