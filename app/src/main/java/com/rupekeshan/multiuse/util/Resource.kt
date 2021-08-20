package com.rupekeshan.multiuse.util

sealed class Resource<T>(val data:T?=null, val message: String?=null){
    class Success<T>(data: T?) : Resource<T>(data)
    class Error<T>(message:String, data: T?) : Resource<T>(data, message)
    object Loading : Resource<Any>()
}