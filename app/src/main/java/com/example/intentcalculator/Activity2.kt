package com.example.intentcalculator

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity2 : AppCompatActivity(), View.OnClickListener {

    private lateinit var ResultTV2: TextView

    private lateinit var input1: EditText
    private lateinit var input2: EditText

    private lateinit var ButtonSum: Button
    private lateinit var ButtonDiv: Button
    private lateinit var ButtonDif: Button
    private lateinit var ButtonMult: Button
    private lateinit var ButtonTransfer: Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_2)

        ResultTV2 = findViewById(R.id.ResultTV2)

        input1 = findViewById(R.id.input1)
        input2 = findViewById(R.id.input2)
        ButtonSum = findViewById(R.id.ButtonSum)
        ButtonDif = findViewById(R.id.ButtonDif)
        ButtonDiv = findViewById(R.id.ButtonDiv)
        ButtonMult = findViewById(R.id.ButtonMult)
        ButtonTransfer = findViewById(R.id.ButtonTransfer)

ButtonSum.setOnClickListener(this)
        ButtonMult.setOnClickListener(this)
        ButtonDif.setOnClickListener(this)
        ButtonDiv.setOnClickListener (this)

        ButtonTransfer.setOnClickListener {
            if (ResultTV2.text.isEmpty())return@setOnClickListener
            val result = Intent(this, MainActivity::class.java)
           result.putExtra("key", ResultTV2.text.toString())
            startActivity(result)


        }
    }

    override fun onClick(p0: View?) {

        var first = input1.text.toString().toDouble()
        var second = input2.text.toString().toDouble()

        if (input1 != null && input2 != null){
            var result = when(p0!!.id){
                R.id.ButtonSum ->  first + second
                R.id.ButtonDif ->  first / second
                R.id.ButtonDiv ->  first - second
                R.id.ButtonMult -> first * second
                else -> 0.0
            }
            ResultTV2.text = result.toString()

        }










        }
    }
