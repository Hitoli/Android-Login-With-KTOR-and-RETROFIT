package com.example.sqc.data.networkKtor

import kotlinx.serialization.Serializable

@Serializable
data class LoginKtorBody(
val email:String,
val password:String
)

