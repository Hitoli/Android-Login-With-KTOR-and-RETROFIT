package com.example.sqc.Presentation.utils

sealed class ScreensNav(val route:String){
    object LoginScreen:ScreensNav("LoginScreen")

    object SignUpScreen:ScreensNav("SignUpScreen")
    object HomeScreen:ScreensNav("HomeScreen")
}
