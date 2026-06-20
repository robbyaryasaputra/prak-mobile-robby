package com.example.appasikk.Home.pertemuan_13

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.appasikk.databinding.ActivityThirteenthBinding
import com.google.android.material.tabs.TabLayoutMediator

class ThirteenthActivity : AppCompatActivity() {

    private lateinit var binding: ActivityThirteenthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirteenthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Setup Toolbar
        setSupportActionBar(binding.toolbar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            title = "Pertemuan 13"
        }
        binding.toolbar.setNavigationOnClickListener { onBackPressedDispatcher.onBackPressed() }

        // Setup ViewPager2 Adapter
        binding.viewPager.adapter = ThirteenthTabsAdapter(this)

        // Hubungkan TabLayout dengan ViewPager2
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            when (position) {
                0 -> tab.text = "Capture"
                1 -> tab.text = "Scan"
                2 -> tab.text = "QR Code"
            }
        }.attach()
    }
}
