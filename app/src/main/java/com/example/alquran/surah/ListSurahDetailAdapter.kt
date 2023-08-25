package com.example.alquran.surah

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.alquran.ListSurahAdapter
import com.example.alquran.R
import com.example.alquran.models.detailSurah.Data

class ListSurahDetailAdapter(val detailSurahActivity: DetailSurahActivity, val data: Data) :
    RecyclerView.Adapter<ListSurahDetailAdapter.ListSurahDetailHolder>() {
    class ListSurahDetailHolder(itemView : View) : ViewHolder(itemView) {
        var txtNomor :TextView = itemView.findViewById(R.id.txtNomorAyat)
        var txtAyatArab :TextView = itemView.findViewById(R.id.txtAyatArab)
        var txtAyatLatin :TextView = itemView.findViewById(R.id.txtAyatLatin)
        var txtTerjemah :TextView = itemView.findViewById(R.id.txtTerjemah)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListSurahDetailHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_ayat, parent, false)
        return ListSurahDetailHolder(view)
    }

    override fun getItemCount(): Int {
        return data.ayat.size
    }

    override fun onBindViewHolder(holder: ListSurahDetailHolder, position: Int) {
        val data = data.ayat.get(position)
        with(holder) {
            txtNomor.setText(data.nomorAyat.toString())
            txtAyatArab.setText(data.teksArab.toString())
            txtAyatLatin.setText(data.teksLatin.toString())
            txtTerjemah.setText(data.teksIndonesia.toString())
        }
    }

}
