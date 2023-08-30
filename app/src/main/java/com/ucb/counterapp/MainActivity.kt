package com.ucb.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var labelCounter: TextView
    lateinit var btnCounter : Button
    var counter: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //enlazar con el identicador del xml
        labelCounter = findViewById(R.id.labelCounter)
        btnCounter = findViewById(R.id.btnCounter)

        btnCounter.setOnClickListener {
            counter++
            labelCounter.text = counter.toString()
        }

    }
}