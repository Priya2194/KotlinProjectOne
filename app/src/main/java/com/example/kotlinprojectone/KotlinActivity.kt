package com.example.kotlinprojectone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class KotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

        Toast.makeText(this,"Open the KotlinActivity", Toast.LENGTH_LONG).show();
    }
}