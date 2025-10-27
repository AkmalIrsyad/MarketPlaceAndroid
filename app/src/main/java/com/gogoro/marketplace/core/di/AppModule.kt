package com.gogoro.marketplace.core.di

import org.koin.dsl.module
import com.gogoro.marketplace.core.data.source.local.LocalDataSource
import com.gogoro.marketplace.core.data.source.remote.RemoteDataSource
import com.gogoro.marketplace.core.data.source.remote.network.ApiConfig

val appModule = module {
    single { ApiConfig.provideApiService }
    single { RemoteDataSource(get()) }

    single {LocalDataSource()}
}
