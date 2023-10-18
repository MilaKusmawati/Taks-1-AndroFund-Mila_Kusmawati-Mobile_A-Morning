package com.example.macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.macro.databinding.ActivityCustomerServiceBinding

class CustomerServiceActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCustomerServiceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCustomerServiceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnKirim.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}