package com.example.ejerciciointers

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import java.util.*
import kotlin.random.Random.Default.nextInt

class MainActivity : AppCompatActivity() {
    companion object {
        const val textito = "hola"
    }
  
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        val boton1 = findViewById<Button>(R.id.boton1)
        boton1.setOnClickListener{
            //DALE
            val intent=Intent(this, activity2::class.java)
            intent.putExtra(textito,1)
            startActivity(intent)
        }

        val boton2 = findViewById<Button>(R.id.boton2)
        val texto = findViewById<EditText>(R.id.textoOriginal)
        boton2.setOnClickListener{
            //DALE
            val intent2 = Intent(this, activity3::class.java)
            intent2.putExtra(textito,texto.text.toString().length)
            startActivity(intent2)
            }

        val boton3 = findViewById<Button>(R.id.boton3)
        boton3.setOnClickListener{
            val random = (1..10).random()

            if (random<6) {
                val intent3 = Intent(this, activity2::class.java)
                startActivity(intent3)
            }else{
                val intent4 = Intent(this, activity3::class.java)
                intent4.putExtra(textito,texto.text.toString())
                startActivity(intent4)
            }

        }

        }




    }
