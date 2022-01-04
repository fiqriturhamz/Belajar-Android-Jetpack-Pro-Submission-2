package com.example.imovie.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.imovie.R
import com.example.imovie.databinding.ActivityMainBinding
import com.example.imovie.adapter.SectionsPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val tabTitles = arrayOf(
        R.string.tab_text_1,
        R.string.tab_text_2
    )

    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sectionsPagerAdapter = SectionsPagerAdapter(this)
        binding.viewPager.adapter = sectionsPagerAdapter
        TabLayoutMediator(binding.tabs, binding.viewPager) { tab, position ->
            tab.text = resources.getString(tabTitles[position])
            binding.viewPager.setCurrentItem(tab.position, true)
        }.attach()
    }
}