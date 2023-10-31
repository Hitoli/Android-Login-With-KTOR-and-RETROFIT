package com.example.sqc.data.networkKtor

import com.example.sqc.data.networkRetrofit.LoginBody
import com.example.sqc.data.response.KtorAPIResponse
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.client.request.url
import io.ktor.http.HttpStatusCode
import javax.inject.Inject

class LoginKtorCall @Inject constructor(private val loginKtorClass: LoginKtorClass){

    companion object{
        const val BASE_URLKTOR =
            "http://13.214.111.235/public/api/login"
    }

    suspend fun KtorPost():HttpStatusCode{
        return loginKtorClass.getHttpClient().post {
            url(BASE_URLKTOR)
            setBody(LoginKtorBody(email = "tanya@singsys.com", password = "Lucknow@1"))
        }.status
    }
}