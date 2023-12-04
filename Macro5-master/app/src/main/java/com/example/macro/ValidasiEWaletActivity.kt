package com.example.macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.macro.databinding.ActivityValidasiEwaletBinding

class ValidasiEWaletActivity : AppCompatActivity() {

    private lateinit var binding: ActivityValidasiEwaletBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityValidasiEwaletBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ibHomeValidasiEwallet.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
        }
        binding.btnTarikEwallet.setOnClickListener {
            startActivity(Intent(this, TukarPointBerhasilActivity::class.java))
        }
        binding.ibBackArrowValidasiEwallet.setOnClickListener {
            startActivity(Intent(this, EWaletActivity::class.java))
        }
    }
}