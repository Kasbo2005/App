package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Supervisor : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_supervisor)

        val message = intent.getStringExtra("EXTRA_MESSAGE!")
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = message
        }
        val message1 = intent.getStringExtra("EXTRA_MESSAGE1!")
        val textView1 = findViewById<TextView>(R.id.textView1).apply {
            text = message1
        }
        val message2 = intent.getStringExtra("EXTRA_MESSAGE2!")
        val textView2 = findViewById<TextView>(R.id.textView2).apply {
            text = message2
        }

        val button = findViewById<Button>(R.id.buttonBack)
        button.setOnClickListener {
            callActivity()
        }


    }

    private fun callActivity() {
        val editText = findViewById<EditText>(R.id.edit_text)
        val message5 = editText.text.toString()

        val intent = Intent(this, MainActivity::class.java).also {
            it.putExtra("EXTRA_MESSAGE5!", message5)
            startActivity(it)

        }


    }
}