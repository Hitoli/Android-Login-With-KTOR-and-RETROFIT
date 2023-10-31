package com.example.sqc.Presentation.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sqc.R
import com.example.sqc.ui.theme.background
import com.example.sqc.ui.theme.background2

@Preview(showBackground = true)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {

    Scaffold(modifier = Modifier.fillMaxSize(), containerColor = Color.White,topBar = {
        TopAppBar(modifier= Modifier
            .padding(40.dp), colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = background2), title = { Text(text = "") }, navigationIcon = {
            Icon(
                painter = painterResource(id = R.drawable.back_icon),
                contentDescription = "backIcon", tint = Color.Black
            )
        }
        )
    }) {
        val pad = it.calculateTopPadding()
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 40.dp, start = 40.dp, end = 40.dp, bottom = 40.dp),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(modifier= Modifier) {
                Text(
                    text = "Welcome Back,",
                    modifier = Modifier.fillMaxWidth(),
                    fontWeight = FontWeight.Bold,
                    fontSize = 40.sp
                )
                Text(
                    text = "Log in to continue,",
                    modifier = Modifier.fillMaxWidth(), fontSize = 20.sp
                )

            }
            Column(modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .background(Color.White)) {
                TextField(modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White),value = "Email", onValueChange = {}, colors = TextFieldDefaults.textFieldColors(containerColor = Color.White, textColor = Color.Black),leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_add_friend),
                        contentDescription = "Email", tint = Color.Black
                    )
                })
                Spacer(modifier = Modifier.size(20.dp))

                TextField(modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White),value = "Password", onValueChange = {},colors = TextFieldDefaults.textFieldColors(containerColor = Color.White, textColor = Color.Black), leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Email",tint = Color.Black
                    )
                }, trailingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.back_icon),
                        contentDescription = "Email",tint = Color.Black
                    )
                })
                Spacer(modifier = Modifier.size(8.dp))
                Text(
                    text = "Forgot Password",
                    modifier = Modifier.fillMaxWidth(), fontSize = 10.sp
                )


            }
            Column {

                Row(modifier = Modifier.align(Alignment.CenterHorizontally)){
                    Text(
                        text = "Having a problem?",
                        modifier = Modifier,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.size(8.dp))
                    Text(
                        text = "Contact Us",
                        modifier = Modifier
                    )
                }
                Spacer(modifier = Modifier.size(15.dp))

                ElevatedButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.align(Alignment.CenterHorizontally), colors = ButtonDefaults.buttonColors(
                        background)
                ) {
                    Text(
                        text = "Continue",
                        color = Color.White,
                        modifier = Modifier.padding(horizontal = 80.dp)
                    )
                }

            }


        }

    }


}