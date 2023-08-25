package com.example.alquran.surah

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.ViewModelFactoryDsl
import com.example.alquran.models.detailSurah.DetailSurah
import com.example.alquran.repository.Repository

class DetailSurahViewModelFactory(private  val repository: Repository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return DetailSurahViewModel(repository) as T
    }
}