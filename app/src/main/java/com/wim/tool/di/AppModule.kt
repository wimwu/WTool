package com.wim.tool.di

import android.app.Application
import com.wim.tool.App
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * @author wim
 * @date 2021/12/8
 */
@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    fun provideReadingApp(application: Application): App {
        return application as App
    }
}