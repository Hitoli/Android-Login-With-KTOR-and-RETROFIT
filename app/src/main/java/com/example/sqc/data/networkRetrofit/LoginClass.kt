package com.example.sqc.data.networkRetrofit

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
        return LoginBody(email = "tanya@singsys.com", password = "Lucknow@1")
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
                "Bearer","eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiIzIiwianRpIjoiYjI4ZmU4NTE2YzE3ZWJmNWE4OTNmMTMwZmE2Nzg1MTFkMGVkNTU0NjJkNjdkZGVhYmQxZWE2MzBjN2JjOTczY2IyZjQ0ZGUyODA0ZWFjMjMiLCJpYXQiOjE2OTg3MjgxMzguMTg4NjY4LCJuYmYiOjE2OTg3MjgxMzguMTg4NjcyLCJleHAiOjE3MzAzNTA1MzguMTgzMjIsInN1YiI6IjgzNSIsInNjb3BlcyI6W119.ESzkgt6u3kYlJx61xQJDH-YvYfUpl5yrA-Uc3ABQGvf08ctbDN4TR5wkld7n-4gzIAcwMEuu9WhByiTBDfkjUG-wZ_pBCd1BQxA68x7XYFqUheFnOr14-BhkIhvAw3ANjJS3wE94YCyQW6eCX6dDwUsS0DUZruIlZTQw9fQ-eBZY4in9Vl6RFGKwA7_pmSDOSaW3K7sUO8TCSHex4OOVT7fd3g7QmlDJzH8FF1B3cDCJPw4447oHqVTcj2YW-npSJCwt8rfqdBlaf83DQZyTrgvIepOebRv8aW6x-UdbaTS96kfsMOL25IWS6paj1GsKlcuQAoJ0bnCmORb_btR1n2W0PWE6VA0lHbv5EZ-9M2nBnz6pvd2L6fLagTErQm9wp7RjfUfQkQ-m_9PVN9X8zW1PGZiwp5F8Bl-dWMs9tyYjklFJ_R8aUgw__xEU_4PzNW4-gvHzUkFdDLknOtVFawiZuhA70MOwq2Cy0gBlDMs48nVm5gytOIuMnZjYCJ2gLtwEXjGxDgiYADz_OIbP-IixZmMRwKAxwu9CCF9udE2L0lLSdmZFJxnGTxXxvUx22ASLsnQnGvcKLRASuRhx6bgy9XwWD9h5Uc073IsMlSdHD-cbSKtSW58lT7tV9d8wACjhFjZ9ULioPMgV2gutygi6moQ9bKH-m216Fdb9_Zc")
        ).addInterceptor(interceptor).connectTimeout(60, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .writeTimeout(10, TimeUnit.MINUTES).build()
    }

}