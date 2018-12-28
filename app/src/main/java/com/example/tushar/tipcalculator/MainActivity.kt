package com.example.tushar.tipcalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener{
            val billamount=editText.text.toString().toDouble()
            val tipPercent=editText2.text.toString().toDouble()
            val tip=billamount*tipPercent
            val total=tip*0.01+billamount
            textView3.text=("Tip is Rs.${(tip*0.01).toString()} and Total is Rs.${total.toString()}.")
        }
    }
}
