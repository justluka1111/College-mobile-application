package com.example.finalproject3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val openMonths = findViewById<Button>(R.id.btnmonths)
        openMonths.setOnClickListener {
            val sixmonthsl = Intent(this, Six_monthpage::class.java)
            startActivity(sixmonthsl)
        }
        val openWeeks = findViewById<Button>(R.id.btnweeks)
        openWeeks.setOnClickListener {
            val sixweekssl = Intent(this, SixWeekscreen::class.java)
            startActivity(sixweekssl)
        }
    }
}