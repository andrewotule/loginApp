package com.andrew.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT = 5000L // SET SPLASH SCREEN TIMER

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed({
            val i = Intent(this,MainActivity::class.java)
            startActivity(i)
        },SPLASH_TIME_OUT
        )
    }
}