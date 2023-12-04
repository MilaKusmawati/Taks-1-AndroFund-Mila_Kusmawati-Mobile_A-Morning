package com.example.macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.macro.databinding.ActivityMapsBinding

class MapsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMapsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnKembali.setOnClickListener {
            startActivity(Intent(this, AlamatPickupActivity::class.java))
        }
        binding.btnUbah.setOnClickListener {
            startActivity(Intent(this, AlamatPickupActivity::class.java))
        }
    }
}