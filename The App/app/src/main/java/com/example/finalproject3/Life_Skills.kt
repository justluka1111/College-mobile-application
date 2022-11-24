package com.example.finalproject3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Life_Skills : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_skills)

        val openApply = findViewById<Button>(R.id.button11)
        openApply.setOnClickListener {
            val Apply = Intent(this, Form::class.java)
            startActivity(Apply)
        }
        val openCal = findViewById<Button>(R.id.button12)
        openCal.setOnClickListener {
            val Apply = Intent(this, Calculator::class.java)
            startActivity(Apply)
        }
        }
    }
