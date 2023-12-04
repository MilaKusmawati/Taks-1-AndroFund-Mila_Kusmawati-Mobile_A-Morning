package com.example.macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.macro.databinding.ActivityTrackingBinding

class TrackingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTrackingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTrackingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tombolBank.setOnClickListener {
            startActivity(Intent(this, BankActivity::class.java))
        }
        binding.tombolEwallet.setOnClickListener {
            startActivity(Intent(this, EWaletActivity::class.java))
        }
        binding.btnPulsa.setOnClickListener {
            startActivity(Intent(this, PulsaActivity::class.java))
        }
        binding.barhome.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
        }
        binding.bararticle.setOnClickListener {
            startActivity(Intent(this, ArticleActivity::class.java))
        }
        binding.barprofile.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
        binding.barpickup.setOnClickListener {
            startActivity((Intent(this, PickupActivity::class.java)))
        }
    }
}