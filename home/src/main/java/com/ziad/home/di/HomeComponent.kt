package com.ziad.home.di

 import com.ziad.analytics.di.AnalyticsApi
 import com.ziad.common_di.ActivityScoped
 import dagger.Component

@ActivityScoped
@Component(
    dependencies = [
        AnalyticsApi::class
    ]
)
interface HomeComponent {

    @Component.Builder
    interface Builder {
        fun analyticsComponent(analyticsComponent: AnalyticsApi): Builder
        fun build(): HomeComponent
    }
}