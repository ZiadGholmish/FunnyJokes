package com.ziad.db_prepare.di

import android.app.Application
import com.ziad.common_di.ActivityScoped
import com.ziad.common_di.FragmentScope
import com.ziad.db.di.DBComponent
import com.ziad.db.di.DBModule
import com.ziad.db.di.DbApi
import com.ziad.db_prepare.DBPreparer

import dagger.BindsInstance
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

        @BindsInstance
        fun application(application: Application): Builder

        fun dbComponent(dbComponent: DbApi): Builder

        fun dbPrepareModule(dbPrepareModule: DBPrepareModule): Builder

        fun build(): DBPrepareComponent
    }
}