package com.example.sqc.data.network

import java.util.concurrent.TimeUnit
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LoginClass {
    companion object {
        const val BASE_URL =
            "http://13.214.111.235/public/api/"
    }

    @Provides
    @Singleton
    fun provideLoginBody():LoginBody{
        return LoginBody(email = "email", password = "Password")
    }

    @Provides
    @Singleton
    fun buildAPI(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder().baseUrl(BASE_URL).client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create()).build()
    }

    @Provides
    @Singleton
    fun buildAPIResponse(retrofit: Retrofit): LoginInterface {
        return retrofit.create(LoginInterface::class.java)
    }

    @Provides
    @Singleton
    fun okkHttp():OkHttpClient {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        return OkHttpClient.Builder().addInterceptor(
            OAuthInterceptor(
                "Bearer","AUthToken")
        ).addInterceptor(interceptor).connectTimeout(60, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .writeTimeout(10, TimeUnit.MINUTES).build()
    }

}
