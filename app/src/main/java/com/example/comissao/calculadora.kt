package com.example.comissao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class calculadora : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        val button = findViewById<Button>(R.id.btnCalcular)
        button.setOnClickListener {
            val SalF = findViewById<EditText>(R.id.editSalariof)
            val kmr = findViewById<EditText>(R.id.editKmRodado)
            val Valcom = findViewById<TextView>(R.id.editValor)
            val SalTot = findViewById<TextView>(R.id.editSalarioTotal)
            val nSalF = SalF?.text.toString().toDouble()
            val nkmr = kmr?.text.toString().toDouble()

                if (nkmr <= 500) {
                    var comissao = nSalF * 0.001
                    var somarsalario = comissao * nkmr
                    var fimdosalario = nSalF+somarsalario
                    Valcom.setText(somarsalario.toString())
                    SalTot.setText(fimdosalario.toString())
                } else if (nkmr > 500.1 && nkmr <= 1000.0) {
                    var comissao = nSalF * 0.001
                    var somarsalario = comissao * nkmr
                    var fimdosalario = nSalF+somarsalario
                    Valcom.setText(somarsalario.toString())
                    SalTot.setText(fimdosalario.toString())
                } else if (nkmr > 1001.0 && nkmr <= 2000.0) {
                    var comissao = nSalF * 0.001
                    var somarsalario = comissao * nkmr
                    var fimdosalario = nSalF+somarsalario
                    Valcom.setText(somarsalario.toString())
                    SalTot.setText(fimdosalario.toString())
                } else {
                    var comissao = nSalF * 0.001
                    var somarsalario = comissao * nkmr
                    var fimdosalario = nSalF+somarsalario
                    Valcom.setText(somarsalario.toString())
                    SalTot.setText(fimdosalario.toString())

                }
            }
        }
    }