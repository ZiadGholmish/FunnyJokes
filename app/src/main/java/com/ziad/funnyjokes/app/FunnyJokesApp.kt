package com.ziad.funnyjokes.app

import android.app.Application
import com.ziad.analytics.di.AnalyticsComponent
import com.ziad.analytics.di.AnalyticsModule
import com.ziad.analytics.di.DaggerAnalyticsComponent
import com.ziad.db.di.DBComponent
import com.ziad.db.di.DBModule
import com.ziad.db.di.DaggerDBComponent
import com.ziad.db_prepare.di.DBPrepareComponent
import com.ziad.db_prepare.di.DBPrepareModule
import com.ziad.db_prepare.di.DaggerDBPrepareComponent
import com.ziad.funnyjokes.di.AppComponent
import com.ziad.funnyjokes.di.AppModule
import com.ziad.funnyjokes.di.DaggerAppComponent

class FunnyJokesApp : Application() {

    lateinit var appComponent: AppComponent

    var dbComponent: DBComponent = DaggerDBComponent
        .builder()
        .application(this).localDataModule(DBModule(this)).build()

    private var analyticComponent: AnalyticsComponent = DaggerAnalyticsComponent
        .builder()
        .application(this)
        .analyticsModule(AnalyticsModule(this))
        .build()

    private var dbPrepareComponent: DBPrepareComponent = DaggerDBPrepareComponent
        .builder()
        .application(this)
        .dbPrepareModule(DBPrepareModule(this))
        .dbComponent(dbComponent)
        .build()

    override fun onCreate() {
        super.onCreate()
        initializeInjector()
    }

    private fun initializeInjector() {
        this.appComponent = DaggerAppComponent.builder()
            .application(this)
            .appModule(AppModule(this))
            .dbComponent(dbComponent)
            .analyticsComponent(analyticComponent)
            .dbPrepareCompnent(dbPrepareComponent)
            .build()
    }


}