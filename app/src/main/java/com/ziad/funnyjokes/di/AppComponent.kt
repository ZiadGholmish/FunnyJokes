package com.ziad.funnyjokes.di

import android.app.Application
import android.content.Context
import com.ziad.analytics.di.AnalyticsApi
import com.ziad.analytics.di.AnalyticsComponent
import com.ziad.common_di.AppScope
import com.ziad.db.di.DBComponent
import com.ziad.db.di.DbApi
import com.ziad.db_prepare.di.DBPrepareAPi
import com.ziad.db_prepare.di.DBPrepareComponent
import com.ziad.funnyjokes.MainActivity

import dagger.Component
import dagger.BindsInstance
import javax.inject.Singleton

@AppScope
@Component(
    modules = [
        AppModule::class
    ],
    dependencies = [
        DbApi::class,
        AnalyticsApi::class,
        DBPrepareAPi::class]
)
interface AppComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun appModule(appModule: AppModule): Builder

        fun dbComponent(dbApi: DbApi): Builder
        fun analyticsComponent(analyticsApi: AnalyticsApi): Builder
        fun dbPrepareCompnent(dbPrepareAPi: DBPrepareAPi): Builder

        fun build(): AppComponent

    }
}