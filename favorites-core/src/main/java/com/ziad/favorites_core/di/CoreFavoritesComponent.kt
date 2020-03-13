package com.ziad.favorites_core.di

import com.ziad.common_di.FragmentScope
import com.ziad.db.di.DbApi
import dagger.Component

@FragmentScope
@Component(
    modules = [
        CoreFavoritesJokeModule::class],
    dependencies = [
        DbApi::class
    ]
)
interface CoreFavoritesComponent : CoreFavoritesApi {

    @Component.Builder
    interface Builder {
        fun dbComponent(dbComponent: DbApi): Builder
        fun build(): CoreFavoritesComponent
    }
}