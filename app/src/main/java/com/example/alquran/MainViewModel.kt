package com.example.alquran

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.alquran.models.SurahResponse
import com.example.alquran.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel(private val repository: Repository) : ViewModel() {

    val mySurah : MutableLiveData<SurahResponse>  = MutableLiveData()

    fun getListSurah()  {
        viewModelScope.launch {
            val response = repository.getListSurah()
            Log.d("oh-my", "ViewModel" + response.toString())
            mySurah.value = response
        }
    }

}