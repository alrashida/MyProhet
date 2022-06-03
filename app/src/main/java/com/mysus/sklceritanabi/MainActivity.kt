package com.mysus.sklceritanabi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import com.mysus.sklceritanabi.Adapter.TabAdapter
import com.mysus.sklceritanabi.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewPager.adapter = TabAdapter(supportFragmentManager,lifecycle)
        TabLayoutMediator(binding.tabLayout, binding.viewPager){tab,position ->
            when(position) {
                0 -> {
                    tab.text = "Nabi"
                }
                1 -> {
                    tab.text = "Rasul"
                }
            }
        }.attach()



    }
}
