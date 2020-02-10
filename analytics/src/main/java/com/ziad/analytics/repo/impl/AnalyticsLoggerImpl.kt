package com.ziad.analytics.repo.impl

import com.google.firebase.analytics.FirebaseAnalytics
import com.ziad.analytics.shared.JOKE_CATEGORY_OPENED
import com.ziad.analytics.shared.JOKE_FAVORED_EVENT
import com.ziad.analytics.shared.JOKE_SHARED_EVENT
import com.ziad.analytics.shared.SCREEN_OPENED_EVENT
import com.ziad.analytics.models.CategoryOpenedEvent
import com.ziad.analytics.models.ScreenOpenedEvent
import com.ziad.analytics.models.SharedJokeEvent
import com.ziad.analytics.models.toBundle
import com.ziad.analytics.repo.interfaces.AnalyticsLogger

class AnalyticsLoggerImpl(private val fireBaseAnalytics: FirebaseAnalytics) : AnalyticsLogger {
    override suspend fun logScreenOpened(screenOpenedEvent: ScreenOpenedEvent) {
        fireBaseAnalytics.logEvent(SCREEN_OPENED_EVENT, screenOpenedEvent.toBundle())
    }

    override suspend fun logJokeShared(sharedJoke: SharedJokeEvent) {
        fireBaseAnalytics.logEvent(JOKE_SHARED_EVENT, sharedJoke.toBundle())
    }

    override suspend fun logFavoriteJoke(favoriteJoke: SharedJokeEvent) {
        fireBaseAnalytics.logEvent(JOKE_FAVORED_EVENT, favoriteJoke.toBundle())
    }

    override suspend fun logCategoryOpened(categoryOpenedEvent: CategoryOpenedEvent) {
        fireBaseAnalytics.logEvent(JOKE_CATEGORY_OPENED, categoryOpenedEvent.toBundle())
    }
}