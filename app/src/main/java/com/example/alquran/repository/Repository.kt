package com.example.alquran.repository

import com.example.alquran.api.RetrofitInstance
import com.example.alquran.models.SurahResponse
import com.example.alquran.models.detailSurah.DetailSurah
import retrofit2.Call
import retrofit2.Response

class Repository {
    suspend fun getListSurah() : SurahResponse {
        return RetrofitInstance.api.getSurats()
    }

    suspend fun getDetailSurah(nomor : Int) : DetailSurah {
        return RetrofitInstance.api.getDetailSurat(nomor)
    }
}