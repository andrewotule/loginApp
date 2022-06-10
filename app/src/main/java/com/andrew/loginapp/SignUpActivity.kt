package com.andrew.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        //ASSIGNING TASK TO LOG IN TEXT
        val toLogintxt = findViewById<TextView>(R.id.haveAccLogin)
        toLogintxt.setOnClickListener{
            val a = Intent(this, MainActivity::class.java)
            startActivity(a)
        }

        //ASSIGNING TASK TO SIGN UP BUTTON
        val signbtn = findViewById<Button>(R.id.button2)
        signbtn.setOnClickListener{
            val c = Intent(this, HomeActivity::class.java)
            startActivity(c)
        }

    }
}