package com.example.aplikasiizin.services

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitConfig
{

    fun getInterceptor():OkHttpClient{
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY
        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()
        return okHttpClient


    }

    fun getRetrofit():Retrofit{
        return Retrofit.Builder()
            .baseUrl("http://192.168.1.8/cicool/")//Kurang ini kemarin
            .client(getInterceptor())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun getIjin() = getRetrofit().create(IIjin::class.java)
    fun getTracking() = getRetrofit().create(ITracking::class.java)


}