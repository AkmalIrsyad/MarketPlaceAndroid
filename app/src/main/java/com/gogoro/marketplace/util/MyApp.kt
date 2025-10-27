package com.gogoro.marketplace.util

import android.app.Application
import com.gogoro.marketplace.core.di.appModule
import com.gogoro.marketplace.core.di.repositoryModule
import com.gogoro.marketplace.core.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApp)
            modules(listOf(appModule, viewModelModule, repositoryModule))
        }
    }
}