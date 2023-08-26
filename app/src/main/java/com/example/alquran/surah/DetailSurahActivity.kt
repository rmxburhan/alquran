package com.example.alquran.surah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.alquran.R
import com.example.alquran.databinding.ActivityDetailSurahBinding
import com.example.alquran.repository.Repository

class DetailSurahActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDetailSurahBinding
    private var nomor = "1"
    private lateinit var viewModel : DetailSurahViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_surah)

        nomor = intent.getStringExtra("nomor") ?:""
        Log.d("nomor-surah", nomor)

        binding = ActivityDetailSurahBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val repository = Repository()
        val viewModelFactory = DetailSurahViewModelFactory(repository)
        viewModel = ViewModelProvider(this,viewModelFactory ).get(DetailSurahViewModel::class.java)
        viewModel.getSurahInfo(nomor.toInt())
        viewModel.mySurah.observe(this, Observer { response ->
            runOnUiThread {
                binding.txtAyat.setText("${response.data.jumlahAyat.toString()} Ayat")
                binding.txtNamaSurah.setText(response.data.arti)
                binding.txtKeterangan.setText(response.data.tempatTurun)
                binding.listAyat.adapter = ListSurahDetailAdapter(this@DetailSurahActivity, response.data)
            }
       })
    }
}