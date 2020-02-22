package com.ziad.db_prepare.di

 import com.ziad.common_di.ActivityScoped
import com.ziad.db.di.DbApi

 import dagger.Component

@ActivityScoped
@Component(
    modules = [
        DBPrepareModule::class
    ],
    dependencies = [
        DbApi::class
    ]
)
interface DBPrepareComponent : DBPrepareAPi {


    @Component.Builder
    interface Builder {

        fun dbComponent(dbComponent: DbApi): Builder

        fun dbPrepareModule(dbPrepareModule: DBPrepareModule): Builder

        fun build(): DBPrepareComponent
    }
}