package com.example.sqc.Presentation.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sqc.R
import com.example.sqc.ui.theme.background

@Composable
fun SQCloneLoginScreen(onLogin:()->Unit) {
    Column(
        modifier = Modifier
            .background(color = background)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_group_invite),
            contentDescription = "Login Screen",
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .size(500.dp)
        )
        Column {
            ElevatedButton(
                onClick = {/*TODO*/ },
                modifier = Modifier.align(Alignment.CenterHorizontally), colors = ButtonDefaults.buttonColors(Color.White)
            ) {
                Text(
                    text = "Sign Up",
                    color = background,
                    modifier = Modifier.padding(horizontal = 100.dp)
                )
            }
            Spacer(modifier = Modifier.size(10.dp))
            Row(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(text = "If you already have an account", color= Color.White)
                Spacer(modifier = Modifier.size(8.dp))
                Text(text = "LOGIN", color = Color.White, fontWeight = FontWeight.Bold, modifier = Modifier.clickable {
                    onLogin()
                })

            }

        }
    }

}
@Preview(showBackground = true)
@Composable
fun PreviewScreenit() {
    SQCloneLoginScreen(onLogin = {})
}