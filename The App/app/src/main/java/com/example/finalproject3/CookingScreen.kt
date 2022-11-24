package com.example.finalproject3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CookingScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cooking_screen)

        val openApply = findViewById<Button>(R.id.button7)
        openApply.setOnClickListener {
            val Apply = Intent(this, Week_form::class.java)
            startActivity(Apply)
        }
        val openCal = findViewById<Button>(R.id.button8)
        openCal.setOnClickListener {
            val Apply = Intent(this, Calculator::class.java)
            startActivity(Apply)
        }
    }
}