package com.example.sqc.data.Utils

sealed class Results<out T>{
    data class Success<out R>(val data:R):Results<R>()
    data class Failure (val ErrorCode:String):Results<Nothing>()
    object Loading:Results<Nothing>()
}
