package com.example.macro

import android.content.Intent
import android.os.Bundle
import android.window.SplashScreen
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
            startActivity(Intent(this, LoginActivity::class.java))
        }
        binding.bararticle.setOnClickListener {
            startActivity(Intent(this, ArticleActivity::class.java))
        }
        binding.barhome.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
        }
        binding.btnEditProfile.setOnClickListener {
            startActivity(Intent(this, EditProfileActivity::class.java))
        }
        binding.btnChangePassword.setOnClickListener {
            startActivity(Intent(this, ChangePasswordActivity::class.java))
        }
        binding.btnCustomerService.setOnClickListener {
            startActivity(Intent(this, CustomerServiceActivity::class.java))
        }
        binding.btnFaq.setOnClickListener {
            startActivity(Intent(this, FaqActivity::class.java))
        }
        binding.bartracking.setOnClickListener {
            startActivity(Intent(this, TrackingActivity::class.java))
        }
        binding.barpickup.setOnClickListener {
            startActivity(Intent(this, PickupActivity::class.java))
        }
    }
}