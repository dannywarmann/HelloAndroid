package com.example.helloapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_increment = findViewById<Button>(R.id.btnincrement)
        var txtView = findViewById<TextView>(R.id.increment_by_1)
        var clickCount = 0

        btn_increment.setOnClickListener{
            clickCount ++
            txtView.text = clickCount.toString()
            Toast.makeText(this@MainActivity, "+1", Toast.LENGTH_SHORT).show()
        }
    }
}
