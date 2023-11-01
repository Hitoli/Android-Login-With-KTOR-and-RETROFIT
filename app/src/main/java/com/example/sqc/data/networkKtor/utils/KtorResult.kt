package com.example.sqc.data.networkKtor.utils

sealed class KtorResult<out T>{

    data class Success<out R>(val data:R): KtorResult<R>()
    data class Failure<out R>(val ErrorCode:String): KtorResult<Nothing>()
    data object Loading: KtorResult<Nothing>()


}
