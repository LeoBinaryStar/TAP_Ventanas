package com.example.ventanas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn1: Button = findViewById(R.id.btn1)
        btn1.setOnClickListener{
            var intent1 : Intent = Intent(this, ventana2::class.java)
            startActivity(intent1)
        }

    }
}