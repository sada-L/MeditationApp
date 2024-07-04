package com.example.meditationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class onboarding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding)

        val registrButton: Button = findViewById(R.id.registrButton)

        registrButton.setOnClickListener(){
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
    }
}