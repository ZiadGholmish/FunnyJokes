package com.ziad.home.di

import com.ziad.injector.ComponentInjector
import java.lang.IllegalStateException

object HomeInjector {

    private var homeComponent: HomeComponent? = null
        get() {
            if (field == null)
                throw IllegalStateException("home component should be initialized first")
            return field
        }

    fun initHomeComponent() {
        homeComponent =
            DaggerHomeComponent
                .builder()
                .analyticsComponent(ComponentInjector.analyticComponent!!)
                .build()
    }
}