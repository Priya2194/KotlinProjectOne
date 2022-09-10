package com.example.kotlinprojectone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class PhpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_php)

        Toast.makeText(this,"Open the PhpActivity", Toast.LENGTH_LONG).show();
    }
}