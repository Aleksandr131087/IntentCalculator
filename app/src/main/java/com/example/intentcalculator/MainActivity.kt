package com.example.intentcalculator

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toolbar
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var ResultTV: TextView
    private lateinit var ButtonCalculatorBTN: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ResultTV = findViewById(R.id.ResultTV)
        ButtonCalculatorBTN = findViewById(R.id.ButtonCalculatorBTN)


ButtonCalculatorBTN.setOnClickListener{
val intent = Intent(this, Activity2::class.java)
startActivity(intent)
}

val intent2 = intent.getStringExtra("key")
             if (intent2.isNullOrEmpty()) {
                 ResultTV.text = ResultTV.text
             }
            else
        ResultTV.text = "$intent2"
    }




}

