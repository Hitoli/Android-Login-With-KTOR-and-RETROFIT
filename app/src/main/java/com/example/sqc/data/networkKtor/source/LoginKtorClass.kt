package com.example.sqc.data.networkKtor.source

import android.util.Log
import com.example.sqc.data.networkKtor.service.KtorAPIservice
import com.example.sqc.data.networkKtor.service.KtorAPIserviceImpl
import com.example.sqc.data.networkKtor.utils.LoginKtorBody
import com.example.sqc.data.response.KtorAPIResponse
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.engine.android.Android
import io.ktor.client.plugins.DefaultRequest
import io.ktor.client.plugins.auth.Auth
import io.ktor.client.plugins.auth.providers.BearerTokens
import io.ktor.client.plugins.auth.providers.bearer
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.plugins.observer.ResponseObserver
import io.ktor.client.request.header
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.client.request.url
import io.ktor.http.ContentType
import io.ktor.http.HttpHeaders
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
    class LoginKtorClass {



    companion object{
        const val BASE_URLKTOR =
            "http://13.214.111.235/public/api/login"
    }

    @Provides
    @Singleton
    suspend fun KtorPost(email:String, password:String) {
        val body = getHttpClient("").post {
            url(BASE_URLKTOR)
            setBody(LoginKtorBody(email = email, password = password))
        }.body<KtorAPIResponse>()

        val status = body.message
        Log.e("RESPONSETOKENKTOR", status.toString())

        val token = body.data?.token
        Log.e("RESPONSETOKENKTOR", token.toString())



    }

    @Provides
    @Singleton
    fun getHttpClient(accessToken:String):HttpClient {
        return HttpClient(Android) {
            install(ContentNegotiation) {
                json(Json {
                    prettyPrint = true
                    isLenient = true
                    ignoreUnknownKeys = true
                })
            }

            install(Logging) {
                logger = object : Logger {
                    override fun log(message: String) {
                        Log.e("KTORRESPONSELOGGING", message.toString())
                    }
                }
                level = LogLevel.ALL
            }

            install(ResponseObserver) {
                onResponse { response ->
                    Log.e("KTORRESPONSELOGGING", response.status.value.toString())

                }
            }

            install(DefaultRequest) {
                header(HttpHeaders.ContentType, ContentType.Application.Json)

            }

            install(Auth) {
                bearer {
                    BearerTokens(accessToken = accessToken, "")
                }
            }


        }
    }

    @Module
    @InstallIn(SingletonComponent::class)
    interface LoginKtorinterface {

        @Binds
        @Singleton
        fun provideAPIservice(ktorAPIserviceImpl: KtorAPIserviceImpl):KtorAPIservice

    }
}