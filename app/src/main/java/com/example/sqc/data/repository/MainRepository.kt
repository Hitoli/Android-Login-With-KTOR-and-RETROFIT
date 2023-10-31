package com.example.sqc.data.repository

import com.example.sqc.data.Utils.toResultFlow
import com.example.sqc.data.network.LoginBody
import com.example.sqc.data.network.LoginInterface
import javax.inject.Inject

class MainRepository @Inject constructor(val logininterface:LoginInterface, val loginBody: LoginBody) {

    fun getDetails() = toResultFlow {
        logininterface.LoginAPI(loginBody)
    }
}