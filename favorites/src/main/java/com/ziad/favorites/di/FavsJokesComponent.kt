package com.ziad.favorites.di

import com.ziad.analytics.di.AnalyticsApi
import com.ziad.common_di.FragmentScope
import com.ziad.db.di.DbApi
import com.ziad.favorites.presentation.view.FavoritesFragment
import com.ziad.favorites.presentation.view.FavsViewModel
import com.ziad.favorites_core.di.CoreFavoritesApi
import dagger.Component

@FragmentScope
@Component(
    modules = [
        FavsJokeModule::class,
        ViewModelsModule::class],
    dependencies = [
        DbApi::class,
        AnalyticsApi::class,
        CoreFavoritesApi::class
    ]
)
interface FavsJokesComponent : FavsJokesApi {

    fun inject(favoritesFragment: FavoritesFragment)

    @Component.Builder
    interface Builder {
        fun dbComponent(dbComponent: DbApi): Builder
        fun analyticsComponent(analyticsComponent: AnalyticsApi): Builder
        fun favoritesCore(coreFavoritesApi: CoreFavoritesApi): Builder
        fun build(): FavsJokesComponent
    }
}