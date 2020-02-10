package com.ziad.analytics.di

import android.content.Context
import com.google.firebase.analytics.FirebaseAnalytics
import com.ziad.analytics.repo.impl.AnalyticsLoggerImpl
import com.ziad.analytics.repo.interfaces.AnalyticsLogger
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AnalyticsModule(private val context: Context) {

    @Singleton
    @Provides
    fun providesFireBaseSDK() = FirebaseAnalytics.getInstance(context)

    @Singleton
    @Provides
    fun providesAnalyticsLogger(firebaseAnalytics: FirebaseAnalytics): AnalyticsLogger {
        return AnalyticsLoggerImpl(fireBaseAnalytics = firebaseAnalytics)
    }
}