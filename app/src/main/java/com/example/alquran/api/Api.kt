package com.example.alquran.api

import com.example.alquran.models.SurahResponse
import com.example.alquran.models.detailSurah.DetailSurah
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface Api {
    @GET("api/v2/surat")
    suspend fun getSurats() : SurahResponse

    @GET("api/v2/surat/1")
    suspend fun getDetailSurat() : DetailSurah
}