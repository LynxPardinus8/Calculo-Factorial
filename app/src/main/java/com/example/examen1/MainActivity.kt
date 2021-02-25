package com.example.examen1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.math.BigInteger


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcular(view: View){
        val editTextNumber: EditText = findViewById(R.id.editTextNumber)
        val btnFactorial: Button = findViewById(R.id.btnFactorial)
        val textViewRespuesta: TextView = findViewById(R.id.textViewRespuesta)

        val numero = editTextNumber.text.toString().toInt()
        var factorial:Long = 1
        GlobalScope.launch {
            for (i in 1..numero) {
                // factorial = factorial * i;
                factorial *= i.toLong()
                textViewRespuesta.text = "Resultado: ${factorial.toString()}"
                delay(2000)
            }
        }
    }

}