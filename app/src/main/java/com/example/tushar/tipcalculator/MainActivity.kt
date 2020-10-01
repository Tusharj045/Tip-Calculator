package com.example.tushar.tipcalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener{      // Its an setOnlistenerr when a person clicks on the button
            val bill_amount=editText.text.toString().toDouble()      // it gets triggered
            val tipPercent=editText2.text.toString().toDouble() // above two lines ae getters
            val tip=bill_amount*tipPercent
            val total=tip*0.01+bill_amount
            textView3.text=("Tip is Rs.${(tip*0.02)} and Total is Rs.${total}.")
        } // setting the text value in the fields
    }
}
