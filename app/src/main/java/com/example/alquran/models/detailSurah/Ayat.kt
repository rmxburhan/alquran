package com.example.alquran.models.detailSurah

data class Ayat(
    val audio: Audio,
    val nomorAyat: Int,
    val teksArab: String,
    val teksIndonesia: String,
    val teksLatin: String
)