package com.example.macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.macro.databinding.ActivityArticleBinding

class ArticleActivity : AppCompatActivity() {

    private lateinit var binding: ActivityArticleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityArticleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.barhome.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
        }
        binding.artikel1.setOnClickListener {
            startActivity(Intent(this, IsiArticle1Activity::class.java))
        }
        binding.barprofile.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}