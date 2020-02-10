package com.ziad.categories.di

import android.app.Application
import com.ziad.analytics.di.AnalyticsComponent
import com.ziad.common_di.FragmentScope
import com.ziad.db.di.DBComponent

import dagger.BindsInstance
import dagger.Component

@FragmentScope
@Component(
    modules = [
        CategoriesVMModule::class,
        CategoriesModule::class],
    dependencies = [
        DBComponent::class,
        AnalyticsComponent::class
    ]
)
interface CategoriesComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): CategoriesComponent
    }
}