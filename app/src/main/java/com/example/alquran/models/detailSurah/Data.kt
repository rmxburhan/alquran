package com.example.alquran.models.detailSurah

data class Data(
    val arti: String,
    val audioFull: AudioFull,
    val ayat: List<Ayat>,
    val deskripsi: String,
    val jumlahAyat: Int,
    val nama: String,
    val namaLatin: String,
    val nomor: Int,
    val suratSebelumnya: Boolean,
    val suratSelanjutnya: SuratSelanjutnya,
    val tempatTurun: String
)