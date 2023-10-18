package com.example.macro

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.macro.databinding.ActivityMainBinding
import com.example.macro.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogout.setOnClickListener {
            startActivity(Intent(this, ActivityMainBinding::class.java))
        }
        binding.bararticle.setOnClickListener {
            startActivity(Intent(this, ArticleActivity::class.java))
        }
        binding.barhome.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
        }
    }
}