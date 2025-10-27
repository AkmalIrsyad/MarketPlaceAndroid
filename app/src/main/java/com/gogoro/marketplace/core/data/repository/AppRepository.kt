package com.gogoro.marketplace.core.data.repository

import com.gogoro.marketplace.core.data.source.local.LocalDataSource
import com.gogoro.marketplace.core.data.source.remote.RemoteDataSource

class AppRepository(val local:LocalDataSource, val remote:RemoteDataSource) {

}