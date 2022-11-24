package com.example.finalproject3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SixWeekscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six_weekscreen)

        val openchild = findViewById<Button>(R.id.btnchild)
        openchild.setOnClickListener {
            val childm = Intent(this, ChildMinding::class.java)
            startActivity(childm)
        }
        val opencook = findViewById<Button>(R.id.btncook)
        opencook.setOnClickListener {
            val cook = Intent(this, CookingScreen::class.java)
            startActivity(cook)
        }
        val opengarden = findViewById<Button>(R.id.btngarden)
        opengarden.setOnClickListener {
            val garden = Intent(this, GardenScreen::class.java)
            startActivity(garden)
        }
    }
}