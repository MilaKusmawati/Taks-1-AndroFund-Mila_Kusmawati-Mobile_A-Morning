package com.example.macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.macro.databinding.ActivityAlamatPickupBinding

class AlamatPickupActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAlamatPickupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlamatPickupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPickupSelanjutnya.setOnClickListener {
            startActivity(Intent(this, PickUpBerhasilActivity::class.java))
        }
        binding.ibHomePickup.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
        }
        binding.rlPilihPetaPickup.setOnClickListener {
            startActivity(Intent(this, MapsActivity::class.java))
        }
        binding.ibBackArrowBank.setOnClickListener {
            startActivity(Intent(this, TrackingActivity::class.java))
        }
    }
}