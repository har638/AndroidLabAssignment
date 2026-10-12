package com.example.assignment

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val txtMessage = findViewById<TextView>(R.id.txtMessage)
        val btnClick = findViewById<Button>(R.id.btnClick)

        btnClick.setOnClickListener {
            txtMessage.text = "Button Clicked!"

            Toast.makeText(
                this,
                "Application is working!",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}