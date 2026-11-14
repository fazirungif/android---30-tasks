package com.example.converter

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input = findViewById<EditText>(R.id.amountInput)
        val result = findViewById<TextView>(R.id.resultText)
        val button = findViewById<Button>(R.id.convertButton)

        button.setOnClickListener {
            val rub = input.text.toString()
                .replace(',', '.').toDoubleOrNull()
            if (rub != null) {
                result.text = "%.2f USD".format(rub / 100)
            } else {
                result.text = "Введите число"
            }
        }
    }
}