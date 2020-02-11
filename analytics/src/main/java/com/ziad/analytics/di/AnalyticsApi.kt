package com.ziad.analytics.di

import com.ziad.analytics.repo.interfaces.AnalyticsLogger

interface AnalyticsApi{
    fun provideAnalyticsLogger(): AnalyticsLogger
}