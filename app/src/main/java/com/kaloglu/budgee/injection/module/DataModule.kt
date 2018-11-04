package com.kaloglu.budgee.injection.module

import android.app.Application
import android.arch.persistence.room.Room
import com.kaloglu.budgee.data.cache.BudgeeDb
import com.kaloglu.budgee.data.cache.UserDao
import com.kaloglu.budgee.injection.scopes.PerApplication
import dagger.Module
import dagger.Provides

@Module
abstract class DataModule {

    @Module
    companion object {

        @JvmStatic
        @PerApplication
        @Provides
        fun provideGithubDb(app: Application): BudgeeDb {
            return Room
                    .databaseBuilder(app, BudgeeDb::class.java, "github.db")
                    .fallbackToDestructiveMigration()
                    .build()
        }

        @JvmStatic
        @PerApplication
        @Provides
        fun provideUserDao(db: BudgeeDb): UserDao {
            return db.userDao()
        }
    }
}
