package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLogin : Button = findViewById(R.id.btnLogin)
        val etEmail : EditText = findViewById(R.id.etEmail)
        val etPassword : EditText = findViewById(R.id.etPassword)
        val tverr : TextView = findViewById(R.id.tverr)

        btnLogin.setOnClickListener {

            val userEmail : String = etEmail.text.toString()
            val userPassword : String =etPassword.text.toString()

            if(userEmail.equals("admin@gmail.com") && userPassword.equals("admin123"))
            {
                tverr.text =""
                Toast.makeText(this, "Login Successful", Toast.LENGTH_LONG).show()
            }
            else
            {
                tverr.text = "Something went wrong !!!"
                Toast.makeText(this, "Invalid email or password", Toast.LENGTH_LONG).show()
            }

        }
    }
}