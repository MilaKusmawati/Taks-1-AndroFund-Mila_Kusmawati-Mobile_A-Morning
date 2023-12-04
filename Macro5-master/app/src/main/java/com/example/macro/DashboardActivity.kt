package com.example.macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.macro.databinding.ActivityDashboardBinding

class DashboardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bararticle.setOnClickListener {
            startActivity(Intent(this, ArticleActivity::class.java))
        }
        binding.artikel1.setOnClickListener {
            startActivity(Intent(this, IsiArticle1Activity::class.java))
        }
        binding.barprofile.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
        binding.bartracking.setOnClickListener {
            startActivity(Intent(this, TrackingActivity::class.java))
        }
        binding.barpickup.setOnClickListener {
            startActivity(Intent(this, PickupActivity::class.java))
        }
    }
}