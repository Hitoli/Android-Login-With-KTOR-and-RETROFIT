package com.example.sqc.Presentation.Screens

import android.util.Log
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.sqc.Presentation.viewModel.MainViewModel
import com.example.sqc.data.Utils.Results
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect

@Composable
fun TestScreen(viewModel: MainViewModel= hiltViewModel()) {
    var text:String=""

    LaunchedEffect(key1 = Unit){
        Log.e("ViewModelRESPONSE",viewModel.data.toString())
//        viewModel.data.collect{
//            when(it){
//                is Results.Success->{
//                    text = it.data.message.toString()
//                    Log.e("RESPONSE",it.data.message.toString())
//                }
//                is Results.Failure->{
//                    text = it.ErrorCode.toString()
//                    Log.e("RESPONSE",it.ErrorCode.toString())
//                }
//                Results.Loading->{
//                    text = "Loading"
//                }
//            }
        }
    }

