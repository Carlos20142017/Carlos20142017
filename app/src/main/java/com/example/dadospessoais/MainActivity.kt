package com.example.dadospessoais

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun EnviarMensagem(view: View) {
        val nome = findViewById<TextInputLayout>(R.id.textInputLayoutNome)
        val email = findViewById<TextInputLayout>(R.id.textInputLayoutEmail)
        val telefone = findViewById<TextInputLayout>(R.id.textInputLayoutTelefone)
        val idade = findViewById<TextInputLayout>(R.id.textInputLayoutIdade)

        val intent = Intent(this, MostrarMensagem::class.java)
           startActivity(intent)

    }
}