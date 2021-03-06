package com.ziad.all_jokes.di

import com.ziad.all_jokes.presentation.view.JokesFragment
import com.ziad.analytics.di.AnalyticsApi
import com.ziad.common_di.FragmentScope
import com.ziad.db.di.DbApi
import com.ziad.favorites_core.di.CoreFavoritesApi
import dagger.Component

@FragmentScope
@Component(
    modules = [
        AllJokesVMModule::class,
        AllJokesModule::class],
    dependencies = [
        DbApi::class,
        AnalyticsApi::class,
        CoreFavoritesApi::class
    ]
)
interface AllJokesComponent : AllJokesApi {

    fun inject(jokesFragment: JokesFragment)

    @Component.Builder
    interface Builder {
        fun dbComponent(dbComponent: DbApi): Builder
        fun analyticsComponent(analyticsComponent: AnalyticsApi): Builder
        fun favoritesCore(coreFavoritesApi: CoreFavoritesApi): Builder
        fun build(): AllJokesComponent
    }
}