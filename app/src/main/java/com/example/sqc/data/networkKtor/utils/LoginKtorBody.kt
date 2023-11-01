package com.example.sqc.data.networkKtor.utils

import kotlinx.serialization.Serializable

@Serializable
data class LoginKtorBody(
val email:String,
val password:String
)

