package com.gogoro.marketplace.core.di

import com.gogoro.marketplace.core.data.repository.AppRepository
import org.koin.dsl.module


val repositoryModule = module{
    single{ AppRepository(get(),get()) }
}