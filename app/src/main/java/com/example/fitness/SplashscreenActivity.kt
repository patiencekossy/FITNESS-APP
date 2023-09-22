package com.example.fitness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashscreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)
            setContentView(R.layout.activity_splashscreen)
            GlobalScope.launch {
                delay(2000)
                startActivity(Intent(this@SplashscreenActivity, MainActivity::class.java))
            }
    }

    }