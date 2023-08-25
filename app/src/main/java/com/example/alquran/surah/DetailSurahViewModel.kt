package com.example.alquran.surah

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.alquran.models.detailSurah.DetailSurah
import com.example.alquran.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Call

class DetailSurahViewModel(private val repository: Repository) : ViewModel() {
    val mySurah : MutableLiveData<DetailSurah> = MutableLiveData()

     fun getSurahInfo() {
        viewModelScope.launch {
            val response = repository.getDetailSurah()
            mySurah.value = response
        }
    }
}