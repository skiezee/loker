package com.example.loker

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class pengenalan2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengenalan2)

        val intentButton : Button = findViewById(R.id.button2)
        intentButton.setOnClickListener{view3()}
    }

    private fun view3() {
        val intent = Intent(this, pengenalan3::class.java)
        startActivity(intent)
    }
}