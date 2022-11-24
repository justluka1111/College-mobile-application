package com.example.finalproject3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class sewing : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sewing)

        val openApply = findViewById<Button>(R.id.button4)
        openApply.setOnClickListener {
            val Apply = Intent(this, Form::class.java)
            startActivity(Apply)
        }
        val openCal = findViewById<Button>(R.id.button5)
        openCal.setOnClickListener {
            val Apply = Intent(this, Calculator::class.java)
            startActivity(Apply)
        }
    }
}