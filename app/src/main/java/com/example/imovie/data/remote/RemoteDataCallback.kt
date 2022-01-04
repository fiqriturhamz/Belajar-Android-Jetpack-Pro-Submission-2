package com.example.imovie.data.remote

interface RemoteDataCallback<T> {
    fun onDataReceived(response: T)
}