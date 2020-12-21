package com.raag.chipbottomnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import com.raag.chipbottomnav.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        setUpTabBar()
    }

    private fun setUpTabBar() {

        binding.mainMenu.setOnItemSelectedListener {
            when (it) {
                R.id.home -> binding.mainText.text = "Home"
                R.id.messages -> binding.mainText.text = "Messages"
                R.id.profiel -> binding.mainText.text = "Profiles"
                R.id.settings -> binding.mainText.text = "Settings"

            }
        }
    }
}