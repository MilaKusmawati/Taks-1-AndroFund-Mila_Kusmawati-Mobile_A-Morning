package com.example.macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.macro.databinding.ActivityEwaletBinding

class EWaletActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEwaletBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEwaletBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ibHomeEwallet.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
        }
        binding.btnSelanjutnyaEwallet.setOnClickListener {
            startActivity(Intent(this, ValidasiEWaletActivity::class.java))
        }
        binding.ibBackArrowEwallet.setOnClickListener {
            startActivity(Intent(this, TrackingActivity::class.java))
        }
    }
}