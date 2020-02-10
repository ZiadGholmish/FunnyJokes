package com.ziad.analytics.di

import android.app.Application
import com.ziad.analytics.repo.interfaces.AnalyticsLogger
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticsModule::class])
interface AnalyticsComponent {

    fun provideAnalyticsLogger(): AnalyticsLogger

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun analyticsModule(dbModule: AnalyticsModule): Builder

        fun build(): AnalyticsComponent
    }
}