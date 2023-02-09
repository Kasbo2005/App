package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Supervisor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_supervisor)
        var button5 = findViewById<Button>(R.id.buttonBack)
            button5.setOnClickListener{
                val Intent2 = Intent(this, MainActivity::class.java)
                startActivity(Intent2)



        }
    }
}