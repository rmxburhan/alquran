package com.example.alquran

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ReadFragmentAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return ConstantReadMenu.TabItem.size
    }

    override fun createFragment(position: Int): Fragment {
        when(position) {
            0 -> return SurahFragment()
            1 -> return JuzFragment()
            else -> return SurahFragment()
        }
    }
}