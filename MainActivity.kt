package com.example.test2

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textMessage = findViewById<TextView>(R.id.textMessage)
        var buttonA = findViewById<Button>(R.id.button_A)
        var buttonB = findViewById<Button>(R.id.button_B)
        var buttonX = findViewById<Button>(R.id.button_X)
        var inputText = findViewById<EditText>(R.id.editTextTextPersonName)

        buttonA.setOnClickListener {
            textMessage.setText("abc")
        }
        buttonB.setOnClickListener {
            textMessage.setText(R.string.textMessage_B)
        }
        buttonX.setOnClickListener {
            textMessage.setText(R.string.inputText)
        }
    }
}