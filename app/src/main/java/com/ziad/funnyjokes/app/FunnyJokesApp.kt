package com.ziad.funnyjokes.app

import android.app.Application
import com.ziad.funnyjokes.splash.di.DaggerSplashComponent
import com.ziad.funnyjokes.splash.di.SplashComponent
import com.ziad.injector.ComponentInjector

class FunnyJokesApp : Application() {

    private var splashComponent: SplashComponent? = null

    override fun onCreate() {
        super.onCreate()
        initComponent()
        initSplashComponent()
    }

    private fun initComponent() {
        ComponentInjector.initCoreModules(this)
    }

    fun removeSplashComponent() {
        splashComponent = null
    }

    fun getSplashComponent(): SplashComponent {
        if (splashComponent == null) throw IllegalStateException("Component already removed")
        return splashComponent!!
    }

    private fun initSplashComponent() {
        splashComponent = DaggerSplashComponent
            .builder()
            .application(this)
            .dbPrepare(ComponentInjector.dbPrepareComponent!!)
            .build()
    }
}
