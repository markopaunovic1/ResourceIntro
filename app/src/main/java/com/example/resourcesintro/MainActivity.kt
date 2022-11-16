package com.example.resourcesintro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var greetinView : TextView
    val name = "Marko"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        greetinView = findViewById(R.id.textView)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            handleButtonPress()
        }
    }

    fun handleButtonPress() {
        greetinView.text = getString(R.string.button_pressed_text, name)
    }
}