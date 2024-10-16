package com.example.saludapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnHello:AppCompatButton = findViewById(R.id.btnHello)
        val etName: AppCompatEditText = findViewById(R.id.etname)
        btnHello.setOnClickListener {
            val name = etName.text.toString()
            Toast.makeText(this, "Hola $name!", Toast.LENGTH_LONG).show()
        }
    }
}