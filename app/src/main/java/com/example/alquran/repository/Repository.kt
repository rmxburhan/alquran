package com.example.alquran.repository

import com.example.alquran.api.RetrofitInstance
import com.example.alquran.models.SurahResponse
import retrofit2.Response

class Repository {
    suspend fun getListSurah() : SurahResponse {
        return RetrofitInstance.api.getSurats()
    }
}