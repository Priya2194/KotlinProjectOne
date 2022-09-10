package com.example.kotlinprojectone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class DartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dart)

        Toast.makeText(this,"Open the DartActivity", Toast.LENGTH_LONG).show();
    }
}