package com.example.sqc.Presentation.utils

import kotlinx.serialization.Serializable

@Serializable
data class LoginInfo(
    val email:String,
    val password:String
)
