package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var countSad = 0
    var countNeutral = 0
    var countHappy = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button1 = findViewById<Button>(R.id.buttonSettings)
        button1.setOnClickListener{
            val intent1 = Intent(this,Supervisor::class.java )
            startActivity(intent1)
        }
    }

    fun onTap(view: View) {
       countSad++
        val textview1 = findViewById(R.id.textViewSad) as TextView
        textview1.text = "$countSad"
    }
    fun onTap1(view: View) {
        countNeutral++
        val textview2= findViewById(R.id.textViewNeutral) as TextView
        textview2.text = "$countNeutral"
    }
    fun onTap2(view: View) {
        countHappy++
        val textview3 = findViewById(R.id.textViewHappy) as TextView
        textview3.text = "$countHappy"
    }
    fun onTap3(view: View) {
        countNeutral=0
            val textview1 = findViewById(R.id.textViewSad) as TextView
            textview1.text = "$countSad"
        countSad=0
            val textview2 = findViewById(R.id.textViewNeutral) as TextView
            textview2.text = "$countNeutral"
        countHappy= 0
            val textview3 = findViewById(R.id.textViewHappy) as TextView
            textview3.text = "$countHappy"

    }
}


