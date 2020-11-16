package com.example.ejerciciointers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val intmio=0
        val texto = findViewById<TextView>(R.id.longitud)
        val longi = intent.getIntExtra(MainActivity.textito,intmio)
        val otro =intent.getStringExtra(MainActivity.textito)

        longi?.let {
            texto.text="El edit text de la activity anterior tenía una longitud de "+longi.toString()+" caracteres"
        }
        otro?.let{
            texto.text="El edit text de la activity anterior contenía: "+otro.toString().toUpperCase()
        }
    }
}