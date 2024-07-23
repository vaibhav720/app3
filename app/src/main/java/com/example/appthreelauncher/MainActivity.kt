package com.example.appthreelauncher

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextData: EditText = findViewById(R.id.editText_data)
        val buttonLaunchCalculator: Button = findViewById(R.id.button_launch_calculator)
        val buttonLaunchFinapp: Button = findViewById(R.id.button_launch_finapp)

        buttonLaunchCalculator.setOnClickListener {
            val data = editTextData.text.toString()
            val intent = Intent()
            intent.action = "com.example.calculator.ACTION"
            intent.putExtra("data", data)
            startActivity(intent)
        }

        buttonLaunchFinapp.setOnClickListener {
            val data = editTextData.text.toString()
            val intent = Intent()
            intent.action = "com.example.finapp.ACTION"
            intent.putExtra("data", data)
            startActivity(intent)
        }
    }
}