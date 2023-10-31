package com.example.sqc.data.networkKtor

import android.util.Log
import io.ktor.client.HttpClient
import io.ktor.client.engine.android.Android
import io.ktor.client.plugins.DefaultRequest
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.plugins.observer.ResponseObserver
import io.ktor.client.request.header
import io.ktor.http.ContentType
import io.ktor.http.HttpHeaders
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

import javax.inject.Inject

class LoginKtorClass @Inject constructor() {

    fun getHttpClient()= HttpClient(Android){

        install(ContentNegotiation) {
            json(Json {
                prettyPrint = true
                isLenient = true
                ignoreUnknownKeys = true
            })
        }

        install(Logging){
            logger = object : Logger{
                override fun log(message: String) {
                    Log.e("KTORRESPONSELOGGING",message.toString())
                }
            }
            level = LogLevel.ALL
        }

        install(ResponseObserver){
            onResponse { response->
                Log.e("KTORRESPONSELOGGING",response.toString())

            }
        }

        install(DefaultRequest){
            header(HttpHeaders.ContentType, ContentType.Application.Json)

        }
    }
}