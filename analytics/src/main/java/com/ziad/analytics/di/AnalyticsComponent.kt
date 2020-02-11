package com.ziad.analytics.di

import android.app.Application
import com.ziad.analytics.repo.interfaces.AnalyticsLogger
import com.ziad.common_di.AnalyticsScope
import com.ziad.common_di.ModuleScope
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticsModule::class])
interface AnalyticsComponent : AnalyticsApi {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun analyticsModule(analyticsModule: AnalyticsModule): Builder

        fun build(): AnalyticsComponent
    }
}