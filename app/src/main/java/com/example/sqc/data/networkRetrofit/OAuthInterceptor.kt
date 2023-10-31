package com.example.sqc.data.networkRetrofit

import okhttp3.Interceptor
import okhttp3.Response

class OAuthInterceptor constructor(
    val TokenType: String, val accessToken: String,
) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()
        request = request.newBuilder().header("Authorization", "$TokenType $accessToken").build()
        return chain.proceed(request)
    }


}