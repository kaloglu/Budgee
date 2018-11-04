package com.kaloglu.budgee.injection.module

import com.kaloglu.budgee.BuildConfig
import com.kaloglu.budgee.api.BudgeeService
import com.kaloglu.budgee.injection.scopes.PerApplication
import com.kaloglu.budgee.utils.LiveDataCallAdapterFactory
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
abstract class RemoteModule {

    @Module
    companion object {

        @JvmStatic
        @PerApplication
        @Provides
        fun provideBudgeeService(): BudgeeService {
            return Retrofit.Builder()
                    .baseUrl(BuildConfig.END_POINT)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(LiveDataCallAdapterFactory())
                    .build()
                    .create(BudgeeService::class.java)
        }

    }

}
