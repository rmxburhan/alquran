package com.example.alquran.models

data class Data(
    val arti: String,
    val audioFull: AudioFull,
    val deskripsi: String,
    val jumlahAyat: Int,
    val nama: String,
    val namaLatin: String,
    val nomor: Int,
    val tempatTurun: String
)