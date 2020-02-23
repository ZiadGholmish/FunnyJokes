package com.ziad.all_jokes.di

import com.ziad.injector.ComponentInjector
import java.lang.IllegalStateException

object AlllJokesInjector {
    var allJokesComponent: AllJokesComponent? = null
        get() {
            if (field == null)
                throw IllegalStateException("All Jokes component should be initialized first")
            return field
        }
        private set

    fun initAllJokesComponent() {
        allJokesComponent =
            DaggerAllJokesComponent
                .builder()
                .analyticsComponent(ComponentInjector.analyticComponent!!)
                .dbComponent(ComponentInjector.dbComponent!!)
                .build()
    }
}