package com.example.helloworld

import android.widget.Button
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val text = findViewById<TextView>(R.id.myText)

        var buttonText = "Toggle"

        button.setOnClickListener {
            if (text.visibility == View.VISIBLE){
                text.visibility = View.INVISIBLE;
            }
            else{
                text.visibility = View.VISIBLE;
            }
        }
    }
}