package com.example.kotlinprojectone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class RubyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ruby)

        Toast.makeText(this,"Open the RubyActivity", Toast.LENGTH_LONG).show();
    }
}