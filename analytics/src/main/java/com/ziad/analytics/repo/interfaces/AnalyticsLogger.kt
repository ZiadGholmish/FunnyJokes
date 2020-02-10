package com.ziad.analytics.repo.interfaces

import com.ziad.analytics.models.CategoryOpenedEvent
import com.ziad.analytics.models.ScreenOpenedEvent
import com.ziad.analytics.models.SharedJokeEvent

interface AnalyticsLogger {
    suspend fun logScreenOpened(screenOpenedEvent: ScreenOpenedEvent)
    suspend fun logJokeShared(sharedJoke: SharedJokeEvent)
    suspend fun logFavoriteJoke(favoriteJoke: SharedJokeEvent)
    suspend fun logCategoryOpened(categoryOpenedEvent: CategoryOpenedEvent)
}