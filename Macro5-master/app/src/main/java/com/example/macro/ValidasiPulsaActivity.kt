package com.example.macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.macro.databinding.ActivityValidasiPulsaBinding

class ValidasiPulsaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityValidasiPulsaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityValidasiPulsaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ibHomeValidasiPulsa.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
        }
        binding.ibBackArrowValidasiPulsa.setOnClickListener {
            startActivity(Intent(this, PulsaActivity::class.java))
        }
        binding.btnTarikPulsa.setOnClickListener {
            startActivity(Intent(this, TukarPointBerhasilActivity::class.java))
        }
    }
}