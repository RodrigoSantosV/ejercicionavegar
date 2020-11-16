package com.example.ejerciciointers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var intmio=0
        val imagen = findViewById<ImageView>(R.id.imagen)
        val cambio = intent.getIntExtra(MainActivity.textito,intmio)
        cambio?.let {
            if (cambio==1)
                imagen.setImageResource(R.mipmap.ic_launcher_foreground)
            else
                imagen.setImageResource(R.mipmap.ic_launcher2_foreground)
        }

    }

}