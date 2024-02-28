package com.example.destinationquizapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var myButton: Button
    private lateinit var myTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myButton = findViewById(R.id.myButton)
        myTextView = findViewById(R.id.myTextView)

        myButton.text = getString(R.string.button_text)

        myButton.setOnClickListener {
            myTextView.visibility = View.VISIBLE
            myTextView.text = getString(R.string.text_view_text)
        }

    }
}