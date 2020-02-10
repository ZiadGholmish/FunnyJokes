package com.ziad.analytics.di

/**
 * interface for the client to implement to provide the analytics components
 * to the components that will depend on this component
 */
interface AnalyticsComponentProvider {
    fun provideAnalyticsComponent(): AnalyticsComponent
}