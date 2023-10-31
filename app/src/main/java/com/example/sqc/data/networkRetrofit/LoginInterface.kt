package com.example.sqc.data.networkRetrofit

import com.example.sqc.data.response.APIresponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginInterface {

    @POST("login")
    suspend fun LoginAPI(@Body loginBody: LoginBody):Response<APIresponse>
}