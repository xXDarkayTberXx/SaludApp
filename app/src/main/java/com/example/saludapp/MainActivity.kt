package com.example.saludapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnHello: AppCompatButton = findViewById(R.id.btnHello)
        val etName: AppCompatEditText = findViewById(R.id.etname)
        btnHello.setOnClickListener {
            val name = etName.text.toString()
            val intentGA = Intent(this, GreetingActivity::class.java)
            intentGA.putExtra("EXTRA_NAME", name)
            startActivity(intentGA)
        }
    }
}