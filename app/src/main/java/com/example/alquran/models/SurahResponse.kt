package com.example.alquran.models

data class SurahResponse(
    val code: Int,
    val `data`: List<Data>,
    val message: String
)