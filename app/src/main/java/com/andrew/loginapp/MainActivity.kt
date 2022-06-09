package com.andrew.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ASSIGNING TASK TO SIGN UP TEXT
        val toSigntxt = findViewById<TextView>(R.id.noAccSignUp)
        toSigntxt.setOnClickListener{
            val b = Intent(this, SignUpActivity::class.java)
            startActivity(b)
        }
        //ASSIGNING TASK TO LOG IN TEXT
        val toLogintxt = findViewById<TextView>(R.id.haveAccLogin)
        toLogintxt.setOnClickListener{
            val a = Intent(this, MainActivity::class.java)
            startActivity(a)
        }

        //ASSIGNING TASK TO LOG IN BUTTON
        val loginbtn = findViewById<Button>(R.id.button)
        loginbtn.setOnClickListener{
            val i = Intent(this, HomeActivity::class.java)
            startActivity(i)
        }

        //ASSIGNING TASK TO SIGN UP BUTTON
        val signbtn = findViewById<Button>(R.id.button2)
        signbtn.setOnClickListener{
            val c = Intent(this, HomeActivity::class.java)
            startActivity(c)
        }
    }
}