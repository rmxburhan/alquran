package com.example.alquran

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.alquran.databinding.FragmentSurahBinding
import com.example.alquran.repository.Repository

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class SurahFragment : Fragment() {
    private lateinit var binding : FragmentSurahBinding
    private lateinit var viewModel: MainViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentSurahBinding.inflate(inflater, container, false)
        val repository = Repository()
        val mainViewModelFactory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this, mainViewModelFactory).get(MainViewModel::class.java)
        viewModel.getListSurah()
        viewModel.mySurah.observe(viewLifecycleOwner, Observer { response ->
            Log.d("err-getSurah",response.toString())
                activity?.runOnUiThread {
                    binding.listSurah.adapter = ListSurahAdapter(this@SurahFragment, response.data)
                }

        })
        return binding.root
    }

}
