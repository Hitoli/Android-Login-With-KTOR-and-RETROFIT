package com.example.sqc.data.networkKtor.service

import com.example.sqc.data.networkKtor.utils.KtorResult
import com.example.sqc.data.response.KtorAPIResponse

interface KtorAPIservice {
    suspend fun postToken(getEmail:String,getPassword:String):String?
}