package com.example.android.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.homework_1.*

class Homework_1: AppCompatActivity() {

    var realValue = "0"
    var old = "0"
    var middle = "0"
    var new = "0"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homework_1)

        number1.setOnClickListener {
            new = new + "1"
            value1.setText(new)
        }
        number2.setOnClickListener {
            new = new + "2"
            value1.setText(new)
        }
        number3.setOnClickListener {
            new = new + "3"
            value1.setText(new)
        }
        number4.setOnClickListener {
            new = new + "4"
            value1.setText(new)
        }
        number5.setOnClickListener {
            new = new + "5"
            value1.setText(new)
        }
        number6.setOnClickListener {
            new = new + "6"
            value1.setText(new)
        }
        number7.setOnClickListener {
            new = new + "7"
            value1.setText(new)
        }
        number8.setOnClickListener {
            new = new + "8"
            value1.setText(new)
        }
        number9.setOnClickListener {
            new = new + "9"
            value1.setText(new)
        }
        number0.setOnClickListener {
            new = new + "0"
            value1.setText(new)
        }

        cancel.setOnClickListener {
            old = "0"
        }

        plus.setOnClickListener {
            old = (old.toInt() + new.toInt()).toString()
            new = "0"
            value1.setText(old)
        }
    }
}