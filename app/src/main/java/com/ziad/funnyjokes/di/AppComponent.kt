package com.ziad.funnyjokes.di

import android.app.Application
import com.ziad.common_di.AppScope

import dagger.Component
import dagger.BindsInstance

@AppScope
@Component
interface AppComponent : AppComponentInterface {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder
        fun build(): AppComponent

    }
}