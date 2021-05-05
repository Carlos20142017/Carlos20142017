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
        val editTextNome = findViewById<EditText>(R.id.editTextNome)
        val editTextEmail = findViewById<EditText>(R.id.editTextEmail)
        val editTextTelefone = findViewById<EditText>(R.id.editTextTelefone)
        val editTextIdade = findViewById<EditText>(R.id.editTextIdade)

        val nome = editTextNome.text.toString()
        val email = editTextEmail.text.toString()
        val telefone = editTextTelefone.text.toString()
        val idade = editTextIdade.text.toString().toIntOrNull()

        var dadosCorreto = true

        if(nome.isBlank()){
            editTextNome.setError(getString(R.string.nome_obrigatorio))
            dadosCorreto = false
        }

        if(email.isBlank()){
            editTextNome.setError(getString(R.string.email_obrigatorio))
            dadosCorreto = false
        }

        if(telefone==null){
            editTextEmail.setError(getString(R.string.telefone_obrigatorio))
            dadosCorreto = false
        }

        if(idade==null){
            editTextNome.setError(getString(R.string.idade_obrigatorio))
            dadosCorreto = false
        }

        if(dadosCorreto) {

            val intent = Intent(this, MostrarMensagem::class.java).apply {
                putExtra(Companion.INFO_EXTRA_NOME, nome)
                putExtra(Companion.INFO_EXTRA_EMAIL, email)
                putExtra(Companion.INFO_EXTRA_TELEFONE, telefone)
                putExtra(Companion.INFO_EXTRA_IDADE, idade)
            }

            startActivity(intent)
        }

    }

    companion object {
        const val INFO_EXTRA_NOME = "Nome"
        const val INFO_EXTRA_EMAIL = "Email"
        const val INFO_EXTRA_TELEFONE = "Telefone"
        const val INFO_EXTRA_IDADE = "Idade"
    }
}