package com.example.sqc.Presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.sqc.Presentation.Screens.HomeScreen
import com.example.sqc.Presentation.Screens.LoginScreen
import com.example.sqc.Presentation.Screens.SQCloneLoginScreen
import com.example.sqc.Presentation.utils.LoginInfo
import com.example.sqc.Presentation.utils.ScreensNav
import com.example.sqc.Presentation.viewModel.MainViewModel

@Composable
fun NavScreen(navHostController: NavHostController) {
    val viemodel = hiltViewModel<MainViewModel>()
    var emailFromLogin by rememberSaveable {
        mutableStateOf("")
    }
    var passwordFromLogin by rememberSaveable {
        mutableStateOf("")
    }

    NavHost(navController = navHostController, startDestination = ScreensNav.SignUpScreen.route){
        composable(ScreensNav.SignUpScreen.route){
            SQCloneLoginScreen(){
                navHostController.navigate(ScreensNav.LoginScreen.route)
            }
        }

        composable(ScreensNav.LoginScreen.route){
            LoginScreen(onNavigateBack = {
                navHostController.navigateUp()
            }, onLogin = {
                email, password ->
                viemodel.getToken(email,password)
                navHostController.navigate(ScreensNav.HomeScreen.route)
            })
        }
        composable(ScreensNav.HomeScreen.route){
            HomeScreen(){
                LoginInfo(emailFromLogin,passwordFromLogin)
            }
        }
    }
}