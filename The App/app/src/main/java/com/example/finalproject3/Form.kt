package com.example.finalproject3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Form : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        val openThank = findViewById<Button>(R.id.button)
        openThank.setOnClickListener {
            val Thank = Intent(this, thank_you::class.java)
            startActivity(Thank)
        }
            val openReturn = findViewById<Button>(R.id.button2)
            openReturn.setOnClickListener {
                val Rtn = Intent(this, MainActivity::class.java)
                startActivity(Rtn)
            }
        }
    }
