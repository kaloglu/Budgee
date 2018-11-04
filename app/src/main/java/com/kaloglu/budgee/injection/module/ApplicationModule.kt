package com.kaloglu.budgee.injection.module

import android.content.Context
import com.kaloglu.budgee.injection.qualifier.ApplicationContext
import com.kaloglu.budgee.injection.scopes.PerApplication
import com.kaloglu.budgee.BudgeeApp
import dagger.Binds
import dagger.Module

@Module
abstract class ApplicationModule {

    @ApplicationContext
    @PerApplication
    @Binds
    abstract fun bindApplication(application: BudgeeApp): Context


}