package com.example.myreading

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent= Intent(this,Selectpage::class.java)

        val buttonView = findViewById<Button>(R.id.get_start)
        buttonView.setOnClickListener{
            startActivity(intent)
        }

    }
}