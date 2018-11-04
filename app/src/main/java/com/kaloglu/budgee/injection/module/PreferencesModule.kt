package com.kaloglu.budgee.injection.module

import android.content.Context
import com.kaloglu.budgee.data.LocalStorage
import com.kaloglu.budgee.injection.qualifier.ApplicationContext
import com.kaloglu.budgee.injection.scopes.PerApplication
import dagger.Module
import dagger.Provides

@Module
class PreferencesModule {

    @PerApplication
    @Provides
    fun providesSharedDataPreferences(@ApplicationContext context: Context): LocalStorage {
        return LocalStorage(context)
    }
}
