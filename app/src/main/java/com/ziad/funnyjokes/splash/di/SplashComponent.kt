package com.ziad.funnyjokes.splash.di

import android.app.Application
import com.ziad.analytics.di.AnalyticsApi
import com.ziad.common_di.ActivityScoped
import com.ziad.common_di.FragmentScope
import com.ziad.db.di.DbApi
import com.ziad.db_prepare.di.DBPrepareAPi
import com.ziad.db_prepare.di.DBPrepareComponent
import com.ziad.funnyjokes.splash.SplashActivity
import dagger.BindsInstance
import dagger.Component

@ActivityScoped
@Component(
    dependencies = [
        DBPrepareAPi::class
    ]
)
interface SplashComponent {

    fun inject(splashActivity: SplashActivity)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun dbPrepare(dbPrepareAPi: DBPrepareAPi): Builder
        fun build(): SplashComponent
    }
}