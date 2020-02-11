package com.ziad.categories.di

import android.app.Application
import com.ziad.analytics.di.AnalyticsApi
import com.ziad.analytics.di.AnalyticsComponent
import com.ziad.common_di.FragmentScope
import com.ziad.db.di.DBComponent
import com.ziad.db.di.DbApi

import dagger.BindsInstance
import dagger.Component

@FragmentScope
@Component(
    modules = [
        CategoriesVMModule::class,
        CategoriesModule::class],
    dependencies = [
        DbApi::class,
        AnalyticsApi::class
    ]
)
interface CategoriesComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun dbComponent(dbComponent: DbApi): Builder
        fun analyticsComponent(analyticsComponent: AnalyticsApi): Builder
        fun build(): CategoriesComponent
    }
}