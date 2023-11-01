package com.example.sqc.data.repository

import com.example.sqc.Presentation.utils.LoginInfo
import com.example.sqc.data.networkKtor.service.KtorAPIservice
import com.example.sqc.data.networkKtor.source.LoginKtorClass
import com.example.sqc.data.networkRetrofit.LoginBody
import com.example.sqc.data.networkRetrofit.LoginInterface
import javax.inject.Inject

class MainRepository @Inject constructor(val apIservice: KtorAPIservice) {

    suspend fun getDetails(loginInfo: LoginInfo):String? {
        return apIservice.postToken(loginInfo.email,loginInfo.password)
    }
}