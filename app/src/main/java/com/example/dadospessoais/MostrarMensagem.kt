package com.example.dadospessoais

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MostrarMensagem : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar_mensagem)

        val nome = intent.getStringExtra(MainActivity.INFO_EXTRA_NOME)
        val email = intent.getStringExtra(MainActivity.INFO_EXTRA_EMAIL)
        val telefone = intent.getStringExtra(MainActivity.INFO_EXTRA_TELEFONE)
        val idade = intent.getIntExtra(MainActivity.INFO_EXTRA_IDADE, 0)

         findViewById<TextView>(R.id.textViewNome).text = nome
         findViewById<TextView>(R.id.textViewEmail).text = email
        findViewById<TextView>(R.id.textViewTelefone).text = telefone
        findViewById<TextView>(R.id.textViewIdade).text = idade.toString()
    }
}