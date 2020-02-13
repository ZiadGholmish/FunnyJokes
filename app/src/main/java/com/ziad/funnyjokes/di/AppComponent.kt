package com.ziad.funnyjokes.di

import android.app.Application
import com.ziad.analytics.di.AnalyticsApi
import com.ziad.common_di.AppScope
import com.ziad.db.di.DbApi
import com.ziad.db_prepare.di.DBPrepareAPi

import dagger.Component
import dagger.BindsInstance

@AppScope
@Component(
    modules = [
        AppModule::class
    ],
    dependencies = [
        DbApi::class,
        AnalyticsApi::class]
)
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun appModule(appModule: AppModule): Builder

        fun dbComponent(dbApi: DbApi): Builder
        fun analyticsComponent(analyticsApi: AnalyticsApi): Builder

        fun build(): AppComponent

    }
}