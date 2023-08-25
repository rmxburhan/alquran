package com.example.alquran.api

import com.example.alquran.models.SurahResponse
import retrofit2.Response
import retrofit2.http.GET

interface Api {
    @GET("api/v2/surat")
    suspend fun getSurats() : SurahResponse
}