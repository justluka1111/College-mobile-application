package com.example.finalproject3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        val calculate = findViewById<Button>(R.id.btncal)
        val display = findViewById<TextView>(R.id.tvDisp)

        calculate.setOnClickListener {
            val price = findViewById<EditText>(R.id.etPri)
            var priceNum = price.text.toString().toInt()

            val courses = findViewById<EditText>(R.id.etCourses)
            var coursesNum = courses.text.toString().toInt()
            var discount: Int = 0
            var vat: Int = 0
            var totalPrice: Int = 0

            if (coursesNum == 2) {
                totalPrice = coursesNum * priceNum
                discount = (totalPrice * 0.05).toInt()
                var totDisc = totalPrice - discount

                vat = (totDisc * 0.15).toInt()
                var totVat = vat + totDisc

                display.apply {
                    text = "DISCOUNT:R${discount.toString()}\nSUBTOTAL: R${totDisc.toString()}\n" +
                            "TOTAL VAT INCLUDED:R${totVat.toString()}"
                }
            }
                else if (coursesNum == 3) {
                    totalPrice = coursesNum * priceNum
                    discount = (totalPrice * 0.1).toInt()
                    var totDisc = totalPrice - discount

                    vat = (totDisc * 0.15).toInt()
                    var totVat = vat + totDisc

                    display.apply {
                        text = "DISCOUNT:R${discount.toString()}\nSUBTOTAL: R${totDisc.toString()}\n" +
                                "TOTAL VAT INCLUDED:R${totVat.toString()}"
                    }

                } else if (coursesNum > 3) {
                totalPrice = coursesNum * priceNum
                discount = (totalPrice * 0.15).toInt()
                var totDisc = totalPrice - discount

                vat = (totDisc * 0.15).toInt()
                var totVat = vat + totDisc

                display.apply {
                    text = "DISCOUNT:R${discount.toString()}\nSUBTOTAL: R${totDisc.toString()}\n" +
                            "TOTAL VAT INCLUDED:R${totVat.toString()}"
                }
            }
            else  {
                totalPrice = coursesNum * priceNum

                var totDisc = totalPrice

                vat = (totDisc * 0.15).toInt()
                var totVat = vat + totDisc

                display.apply {
                    text = "DISCOUNT:R0\nSUBTOTAL: R${totDisc.toString()}\n" +
                            "TOTAL VAT INCLUDED:R${totVat.toString()}"
                }
            }
        }
    }
}