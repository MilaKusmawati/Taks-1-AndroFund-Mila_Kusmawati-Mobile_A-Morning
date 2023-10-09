package com.example.latihan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TestActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val initialFragment = Fragment_1()
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, initialFragment)
            .commit()
    }
    }