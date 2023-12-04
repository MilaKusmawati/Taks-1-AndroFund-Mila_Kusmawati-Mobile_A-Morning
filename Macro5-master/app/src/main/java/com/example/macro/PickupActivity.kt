package com.example.macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.macro.databinding.ActivityPickupBinding

class PickupActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPickupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPickupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSelanjutnyaPickup.setOnClickListener {
            startActivity(Intent(this, AlamatPickupActivity::class.java))
        }
        binding.ibHomePickup.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
        }
    }
}