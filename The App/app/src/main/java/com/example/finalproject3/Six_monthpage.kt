package com.example.finalproject3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Six_monthpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.six_monthpage)

        val opensewing = findViewById<Button>(R.id.button2)
        opensewing.setOnClickListener {
            val sewing = Intent( this, sewing::class.java)
            startActivity(sewing)
        }

        val openlife_S = findViewById<Button>(R.id.button4)
        openlife_S.setOnClickListener {
            val lifeSkills = Intent(this, Life_Skills::class.java)
            startActivity(lifeSkills)
        }
         val openfirst = findViewById<Button>(R.id.button)
        openfirst.setOnClickListener {
            val firstAid = Intent(this, First_Aid::class.java)
            startActivity(firstAid)
        }
        val openLand_S = findViewById<Button>(R.id.button3)
        openLand_S.setOnClickListener {
            val landScaping = Intent(this, Land_Scaping::class.java)
            startActivity(landScaping)
        }
    }
}