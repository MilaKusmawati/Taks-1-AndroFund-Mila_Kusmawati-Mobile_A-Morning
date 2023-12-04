package com.example.macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.macro.databinding.ActivityCustomerServiceBinding
import com.example.macro.databinding.ActivityFaqBinding

class FaqActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFaqBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFaqBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnKembali.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}