package com.example.counter

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val tvCount = findViewById<TextView>(R.id.tvCount)
        val tvTitle = findViewById<TextView>(R.id.tvTitle)
        val btnPlus = findViewById<Button>(R.id.btnPlus)
        val btnMinus = findViewById<Button>(R.id.btnMinus)
        val btnReset = findViewById<Button>(R.id.btnReset)


        var count = 0
        val btnPlus10 = findViewById<Button>(R.id.btnPlus10)

        btnPlus10.setOnClickListener {
            count += 10
            tvCount.text = count.toString()
            tvTitle.text = "Нажато раз: $count"
        }

        btnPlus.setOnClickListener {
            count = count + 1
            tvCount.text = count.toString()
            tvTitle.text = "Нажато раз: $count"
        }

        btnMinus.setOnClickListener {
            count--
            tvCount.text = count.toString()
            tvTitle.text = "Нажато раз: $count"
        }

        btnReset.setOnClickListener {
            count = 0
            tvCount.text = "$count"
            tvTitle.text = "Нажато раз: $count"
        }
    }
}