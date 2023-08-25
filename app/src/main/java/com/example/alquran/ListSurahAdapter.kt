package com.example.alquran

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.ListUpdateCallback
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.alquran.models.Data

class ListSurahAdapter(val surahFragment: SurahFragment, val data: List<Data>) :
    RecyclerView.Adapter<ListSurahAdapter.ListSurahHolder>() {
    class ListSurahHolder(itemView : View) : ViewHolder(itemView) {
        var txtNomor : TextView = itemView.findViewById(R.id.txtNomor)
        var txtNamaSurahLatin : TextView = itemView.findViewById(R.id.txtNamaSurahLatin)
        var txtKeterangan : TextView = itemView.findViewById(R.id.txtKeteranganSurah)
        var txtNamaSurahArab : TextView = itemView.findViewById(R.id.txtNamaSurahArab)
        var menu : TextView = itemView.findViewById(R.id.menu1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListSurahHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list_surah, parent, false)
        return ListSurahHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ListSurahHolder, position: Int) {
        val data = data.get(position)
        with(holder) {
            txtNomor.setText(data.nomor.toString())
            txtNamaSurahLatin.setText(data.namaLatin)
            txtNamaSurahArab.setText(data.nama)
            txtKeterangan.setText("${data.tempatTurun} Ayat-${data.jumlahAyat.toString()}")
            menu.setOnClickListener {
                
            }
        }
    }

}
