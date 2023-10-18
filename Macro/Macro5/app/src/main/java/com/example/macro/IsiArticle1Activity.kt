package com.example.macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.macro.databinding.ActivityIsiArticle1Binding

class IsiArticle1Activity : AppCompatActivity() {

    private  lateinit var binding: ActivityIsiArticle1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIsiArticle1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnKembali.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
        }
        binding.btnBack.setOnClickListener {
            startActivity(Intent(this, ArticleActivity::class.java))
        }
    }
}