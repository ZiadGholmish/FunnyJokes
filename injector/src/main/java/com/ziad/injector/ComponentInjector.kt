package com.ziad.injector

import android.content.Context
import com.ziad.analytics.di.AnalyticsComponent
import com.ziad.analytics.di.AnalyticsModule
import com.ziad.analytics.di.DaggerAnalyticsComponent
import com.ziad.db.di.DBComponent
import com.ziad.db.di.DBModule
import com.ziad.db.di.DaggerDBComponent
import com.ziad.db_prepare.di.DBPrepareComponent
import com.ziad.db_prepare.di.DBPrepareModule
import com.ziad.db_prepare.di.DaggerDBPrepareComponent
import com.ziad.favorites_core.di.CoreFavoritesComponent
import com.ziad.favorites_core.di.DaggerCoreFavoritesComponent
import java.lang.IllegalStateException

object ComponentInjector {

    var dbComponent: DBComponent? = null
        get() {
            if (field == null)
                throw IllegalStateException("database component should be initialized first")
            return field
        }
        private set

    var analyticComponent: AnalyticsComponent? = null
        get() {
            if (field == null)
                throw IllegalStateException("analyticsComponent component should be initialized first")
            return field
        }
        private set

    var dbPrepareComponent: DBPrepareComponent? = null
        get() {
            if (field == null)
                throw IllegalStateException("dbPrepareComponent component should be initialized first")
            return field
        }
        private set


    var coreFavsComponent: CoreFavoritesComponent? = null
        get() {
            if (field == null)
                throw IllegalStateException("CoreFavoritesComponent component should be initialized first")
            return field
        }
        private set

    fun initCoreModules(application: Context) {
        initDbComponent(application)
        initAnalyticsModule(application)
        initDbPrepareModule(application)
        initCoreFavsComponent(application)
    }

    private fun initDbComponent(application: Context) {
        dbComponent =
            DaggerDBComponent
                .builder()
                .localDataModule(DBModule(application)).build()
    }

    private fun initAnalyticsModule(application: Context) {
        analyticComponent = DaggerAnalyticsComponent
            .builder()
            .analyticsModule(AnalyticsModule(application))
            .build()
    }

    private fun initDbPrepareModule(application: Context) {
        dbPrepareComponent = DaggerDBPrepareComponent
            .builder()
            .dbComponent(dbComponent!!)
            .dbPrepareModule(DBPrepareModule(application))
            .build()
    }

    private fun initCoreFavsComponent(application: Context) {
        coreFavsComponent = DaggerCoreFavoritesComponent
            .builder()
            .dbComponent(dbComponent!!)
            .build()
    }

}