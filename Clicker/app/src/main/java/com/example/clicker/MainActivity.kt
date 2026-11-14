package com.example.clicker

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count = 0

        val score = findViewById<TextView>(R.id.scoreText)
        val click = findViewById<Button>(R.id.clickButton)
        val reset = findViewById<Button>(R.id.resetButton)

        click.setOnClickListener {
            count += 1
            score.text = count.toString()
        }

        reset.setOnClickListener {
            count = 0
            score.text = "0"
        }
    }
}