package com.example.ventanas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ventana2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ventana2)
        val btn2: Button = findViewById(R.id.btn2)
        btn2.setOnClickListener{
            var intent2 : Intent = Intent(this, MainActivity::class.java)
            startActivity(intent2)
        }
    }
}