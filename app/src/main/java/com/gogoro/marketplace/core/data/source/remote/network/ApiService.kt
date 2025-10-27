package com.gogoro.marketplace.core.data.source.remote.network

import okhttp3.Response
import retrofit2.http.POST

interface ApiService {

    //@Headers(API)
    @POST("login")
    suspend fun login(
        //@body user: User
    ): Response<RequestBody>


}