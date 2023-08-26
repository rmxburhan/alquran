package com.example.alquran.surah

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.alquran.models.detailSurah.DetailSurah
import com.example.alquran.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Call

class DetailSurahViewModel(private val repository: Repository) : ViewModel() {
    val mySurah : MutableLiveData<DetailSurah> = MutableLiveData()

     fun getSurahInfo(nomor : Int) {
        viewModelScope.launch {
            val response = repository.getDetailSurah(nomor)
            mySurah.value = response
        }
    }
}