package com.example.sqc.data.repository

import com.example.sqc.data.Utils.toResultFlow
import com.example.sqc.data.networkKtor.LoginKtorCall
import com.example.sqc.data.networkRetrofit.LoginBody
import com.example.sqc.data.networkRetrofit.LoginInterface
import io.ktor.http.HttpStatusCode
import javax.inject.Inject

class MainRepository @Inject constructor(val logininterface:LoginInterface, val loginBody: LoginBody,val loginKtorCall: LoginKtorCall, val loginKtorBody: LoginKtorCall) {

    suspend fun getDetails():HttpStatusCode {
        return loginKtorCall.KtorPost()
    }
}