package com.example.patrimonio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class tipos_patrimonio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tipos_patrimonio2)
        val boton2 = findViewById<Button>(R.id.boton2)
        boton2.setOnClickListener {
            val accederPatrimonioNatural = Intent(this, patrimonio_natural::class.java)
            startActivity(accederPatrimonioNatural)
        }
        val boton3 = findViewById<Button>(R.id.boton3)
        boton3.setOnClickListener {
            val accederPatrimonioEtnogrÃ¡fico = Intent(this, patrimonio_etnografico::class.java)
            startActivity(accederPatrimonioEtnogrÃ¡fico)
        }

        val boton4 = findViewById<Button>(R.id.boton4)
        boton4.setOnClickListener {
            val accederPatrimonioEclesiastico = Intent(this, patrimonio_eclesiastico::class.java)
            startActivity(accederPatrimonioEclesiastico)
        }

        val boton5 = findViewById<Button>(R.id.boton5)
        boton5.setOnClickListener {
            val accederPatrimonioArqueoloxico = Intent(this, patrimonio_arqueoloxico::class.java)
            startActivity(accederPatrimonioArqueoloxico)
        }


    }
}