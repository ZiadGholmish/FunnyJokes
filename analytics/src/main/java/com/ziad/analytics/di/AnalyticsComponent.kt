package com.ziad.analytics.di

 import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticsModule::class])
interface AnalyticsComponent : AnalyticsApi {

    @Component.Builder
    interface Builder {

        fun analyticsModule(analyticsModule: AnalyticsModule): Builder

        fun build(): AnalyticsComponent
    }
}