package com.example.macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.macro.databinding.ActivityTukarPointBerhasilBinding

class TukarPointBerhasilActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTukarPointBerhasilBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTukarPointBerhasilBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.kembaliBeranda.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
        }
    }
}