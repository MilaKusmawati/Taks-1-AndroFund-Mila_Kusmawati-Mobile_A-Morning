package com.example.macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.macro.databinding.ActivityPickUpBerhasilBinding

class PickUpBerhasilActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPickUpBerhasilBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPickUpBerhasilBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.kembaliBeranda.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
        }
    }
}