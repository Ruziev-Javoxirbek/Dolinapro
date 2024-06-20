package com.example.dolinapro

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputText = findViewById<EditText>(R.id.inputText)
        val outputText = findViewById<TextView>(R.id.outputText)
        val btnCopy = findViewById<Button>(R.id.btnCopy)
        val btnClose = findViewById<Button>(R.id.btnClose)

        btnCopy.setOnClickListener {
            outputText.text = inputText.text.toString()
        }

        btnClose.setOnClickListener {
            finish()
        }
    }
}
