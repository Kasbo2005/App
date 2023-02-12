package com.example.app

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    var countSad = 0
    var countNeutral = 0
    var countHappy = 0



    @SuppressLint("MissingInflatedId")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btnApply2)
        button.setOnClickListener {
            val builder = AlertDialog.Builder(this@MainActivity)
            builder.setMessage("Om de vraag in te stellen vul je hem in in de balk met de tekst ”Wat wil je weten?” bij het settings menu.\n" +
                    "Om de resultaten te bekijken log in bij de knop settings.\n" +
                    "Om de resultaten te verzamelen laat de app achter op het scherm met de smileys en laat de gebruikers op de smileys klikken")
            builder.setPositiveButton("OK") { dialog, _ -> dialog.dismiss() }
            builder.create().show()
        }

        val button1 = findViewById<Button>(R.id.btnApply)
        button1.setOnClickListener{
            callActivy()
        }
        val message5 = intent.getStringExtra("EXTRA_MESSAGE5!")
        val textView10 = findViewById<TextView>(R.id.textView10).apply{
            text = message5
        }

    }


    private fun callActivy() {

        val aantalHappy = findViewById<TextView>(R.id.textViewHappy)
        val message2 = aantalHappy.text.toString()
        val aantalNeutral = findViewById<TextView>(R.id.textViewNeutral)
        val message1 = aantalNeutral.text.toString()
        val aantalSad = findViewById<TextView>(R.id.textViewSad)
        val message = aantalSad.text.toString()
        val intent = Intent(this,Supervisor::class.java).also {
            it.putExtra("EXTRA_MESSAGE!",message)
            it.putExtra("EXTRA_MESSAGE1!",message1)
            it.putExtra("EXTRA_MESSAGE2!",message2)
            startActivity(it)
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


