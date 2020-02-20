package com.ziad.homeactivity.di

import android.app.Application
import com.ziad.analytics.di.AnalyticsApi
import com.ziad.categories.di.CategoriesApi
import com.ziad.common_di.ActivityScoped
import dagger.BindsInstance
import dagger.Component

@ActivityScoped
@Component(
    dependencies = [
        CategoriesApi::class,
        AnalyticsApi::class
    ]
)
interface HomeComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun categories(categoriesApi: CategoriesApi): Builder
        fun analyticsComponent(analyticsComponent: AnalyticsApi): Builder
        fun build(): HomeComponent
    }
}