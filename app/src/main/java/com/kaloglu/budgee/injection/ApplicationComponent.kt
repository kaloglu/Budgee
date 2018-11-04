package com.kaloglu.budgee.injection

import android.app.Application
import com.kaloglu.budgee.injection.scopes.PerApplication
import com.kaloglu.budgee.BudgeeApp
import com.kaloglu.budgee.injection.module.ActivityBindingModule
import com.kaloglu.budgee.injection.module.ApplicationModule
import com.kaloglu.budgee.injection.module.DataModule
import com.kaloglu.budgee.injection.module.PreferencesModule
import com.kaloglu.budgee.injection.module.RemoteModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@PerApplication
@Component(modules = [
    AndroidSupportInjectionModule::class,
    ApplicationModule::class,
    PreferencesModule::class,
    ActivityBindingModule::class,
    DataModule::class,
    RemoteModule::class
])
interface ApplicationComponent : AndroidInjector<BudgeeApp> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): ApplicationComponent
    }

    override fun inject(githubApp: BudgeeApp)
}
