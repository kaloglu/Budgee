package com.kaloglu.budgee.injection.module

import com.kaloglu.budgee.injection.scopes.PerActivity
import com.kaloglu.budgee.mobileui.main.MainActivity
import com.kaloglu.budgee.injection.module.main.MainModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module(includes = [ActivityModule::class])
abstract class ActivityBindingModule {

    @PerActivity
    @ContributesAndroidInjector(modules = [MainModule::class])
    abstract fun contributesRepoListActivity(): MainActivity

}
