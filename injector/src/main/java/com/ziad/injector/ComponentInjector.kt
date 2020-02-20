package com.ziad.injector

object ComponentInjector {

    private lateinit var appComponent: AppComponent

    private val dbComponent: DBComponent = DaggerDBComponent
        .builder()
        .application(this).localDataModule(DBModule(this)).build()

    private val analyticComponent: AnalyticsComponent = DaggerAnalyticsComponent
        .builder()
        .application(this)
        .analyticsModule(AnalyticsModule(this))
        .build()

    private var splashComponent: SplashComponent? =
        DaggerSplashComponent
            .builder()
            .application(this)
            .dbPrepare(
                DaggerDBPrepareComponent
                    .builder()
                    .application(this)
                    .dbPrepareModule(DBPrepareModule(this))
                    .dbComponent(dbComponent)
                    .build()
            )
            .build()

    fun initAppComponent() {
        this.appComponent = DaggerAppComponent.builder()
            .application(this)
            .appModule(AppModule(this))
            .dbComponent(dbComponent)
            .analyticsComponent(analyticComponent)
            .build()
    }
}