package com.mysus.sklceritanabi.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.mysus.sklceritanabi.fragment.NabiFragment
import com.mysus.sklceritanabi.fragment.RasulFragment

class TabAdapter(fragmentManager:FragmentManager,lifecycle: Lifecycle):FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount() = 2


    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                NabiFragment()
            }
            1 -> {
                RasulFragment()
            }
            else -> {
                Fragment()
            }
        }
    }
}
