package com.example.comissao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun acessar(view : View) {
        val csenha = findViewById<EditText>(R.id.editSenha)
        if (csenha.text.toString().toInt()=="123456".toInt()) {
            val intent = Intent(this, calculadora::class.java).apply{
            }
            startActivity(intent)
        }
        else {
            Toast.makeText(this,"Usuário não encontardo", Toast.LENGTH_SHORT).show()
        }
    }
}