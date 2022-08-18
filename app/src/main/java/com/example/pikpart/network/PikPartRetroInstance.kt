package com.example.pikpart.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PikPartRetroInstance {

    companion object {
        val BaseUrl = "https://api.pikpart.com/"

        fun getRetroInstance(): Retrofit {
            return Retrofit.Builder()
                .baseUrl(BaseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient().build())
                .build()
        }

        private fun okHttpClient(): OkHttpClient.Builder {
            val oktHttpClientBuilder = OkHttpClient.Builder()
            val loggingInterception = HttpLoggingInterceptor()
            loggingInterception.setLevel(HttpLoggingInterceptor.Level.BODY)
            oktHttpClientBuilder.addInterceptor(loggingInterception)
            return oktHttpClientBuilder
        }

    }
}