package com.example.sqc.data.networkKtor.service

import android.util.Log
import com.example.sqc.data.networkKtor.source.LoginKtorClass
import com.example.sqc.data.networkKtor.utils.KtorResult
import com.example.sqc.data.networkKtor.utils.LoginKtorBody
import com.example.sqc.data.response.KtorAPIResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.client.request.url
import javax.inject.Inject

class KtorAPIserviceImpl @Inject constructor(private val httpClient: HttpClient):KtorAPIservice {
    override suspend fun postToken(getEmail: String, getPassword: String): String? {
       val call= KtorResult.Success(httpClient.post {
            url(LoginKtorClass.BASE_URLKTOR)
            setBody(LoginKtorBody(email = getEmail, password = getPassword))
        }.body<KtorAPIResponse>())

        return call.data.data?.token

    }
}