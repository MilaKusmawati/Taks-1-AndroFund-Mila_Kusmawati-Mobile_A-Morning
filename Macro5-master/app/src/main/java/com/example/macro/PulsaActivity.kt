package com.example.macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.macro.databinding.ActivityPulsaBinding

class PulsaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPulsaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPulsaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ibHomePulsa.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
        }
        binding.btnBankSelanjutnya.setOnClickListener {
            startActivity(Intent(this, ValidasiPulsaActivity::class.java))
        }
        binding.ibBackArrowBankpulsa.setOnClickListener {
            startActivity(Intent(this, TrackingActivity::class.java))
        }
    }
}