package com.example.kotlinprojectone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class JavaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_java)

        Toast.makeText(this,"Open the JavaActivity", Toast.LENGTH_LONG).show();
    }
}