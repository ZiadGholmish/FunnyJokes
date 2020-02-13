package com.ziad.analytics.di

import android.content.Context
import com.google.firebase.analytics.FirebaseAnalytics
import com.ziad.analytics.repo.impl.AnalyticsLoggerImpl
import com.ziad.analytics.repo.interfaces.AnalyticsLogger
import com.ziad.common_di.AnalyticsScope
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AnalyticsModule(private val context: Context) {


    @Provides
    fun providesFireBaseSDK() = FirebaseAnalytics.getInstance(context)


    @Provides
    fun providesAnalyticsLogger(firebaseAnalytics: FirebaseAnalytics): AnalyticsLogger {
        return AnalyticsLoggerImpl(fireBaseAnalytics = firebaseAnalytics)
    }
}