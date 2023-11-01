package com.example.sqc.Presentation.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.sqc.Presentation.utils.LoginInfo

@Composable
fun HomeScreen(ondataReceive:()->LoginInfo) {
    var emailFromLogin by rememberSaveable {
        mutableStateOf("")
    }
    var passwordFromLogin by rememberSaveable {
        mutableStateOf("")
    }
    emailFromLogin = ondataReceive().email
    passwordFromLogin = ondataReceive().password
    Column {
        Text(text = emailFromLogin)
        Spacer(modifier = Modifier.size(20.dp))
        Text(text = passwordFromLogin)
    }
   
}