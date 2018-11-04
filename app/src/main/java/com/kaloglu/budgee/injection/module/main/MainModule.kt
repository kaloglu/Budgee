package com.kaloglu.budgee.injection.module.main

import com.kaloglu.budgee.domain.interfaces.main.MainContract
import com.kaloglu.budgee.domain.main.MainPresenter
import com.kaloglu.budgee.injection.module.ActivityModule
import com.kaloglu.budgee.injection.scopes.PerActivity
import com.kaloglu.budgee.mobileui.base.BaseActivity
import com.kaloglu.budgee.mobileui.main.MainActivity
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module(includes = [ActivityModule::class])
abstract class MainModule {

    @Module
    companion object {

        @JvmStatic
        @Provides
        @PerActivity
        fun presenter(): MainContract.Presenter = MainPresenter()

    }

    @Binds
    @PerActivity
    abstract fun main(activity: MainActivity): BaseActivity

}
