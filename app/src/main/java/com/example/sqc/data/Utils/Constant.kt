package com.example.sqc.data.Utils

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Response

fun<T> toResultFlow(call:suspend()-> Response<T>):Flow<Results<T>> = flow{
    emit(Results.Loading)

    val response = call()
    try{
        if(response.isSuccessful){
            response.body()?.let {success->
                emit(Results.Success(success))
            }
        }else{
            response.body()?.let {Fail->
                emit(Results.Failure(Fail.toString()))
            }
        }
    }catch (e:Exception){
        emit(Results.Failure(e.message.toString()))
    }
}