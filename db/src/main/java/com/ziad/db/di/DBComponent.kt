package com.ziad.db.di

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DBModule::class])
interface DBComponent : DbApi {

    @Component.Builder
    interface Builder {

        fun localDataModule(dbModule: DBModule): Builder

        fun build(): DBComponent
    }
}