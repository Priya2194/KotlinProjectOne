package com.example.kotlinprojectone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       c.setOnClickListener()
       {
           intent= Intent(this,CActivity::class.java)

           startActivity(intent)
       }
        cpp.setOnClickListener()
        {
            intent= Intent(this,CppActivity::class.java)
            startActivity(intent)
        }
        java.setOnClickListener()
        {
            intent= Intent(this,JavaActivity::class.java)
            startActivity(intent)

        }
        php.setOnClickListener()
        {
            intent= Intent(this,PhpActivity::class.java)
            startActivity(intent)
        }
        sql.setOnClickListener()
        {
            intent= Intent(this,SqlActivity::class.java)
            startActivity(intent)

        }
        swift.setOnClickListener()
        {
            intent= Intent(this,SwiftActivity::class.java)
            startActivity(intent)

        }
        python.setOnClickListener()
        {
            intent= Intent(this,PythonActivity::class.java)
            startActivity(intent)
        }
        kotlin.setOnClickListener()
        {
            intent= Intent(this,KotlinActivity::class.java)
            startActivity(intent)
        }
        ruby.setOnClickListener()
        {
            intent= Intent(this,RubyActivity::class.java)
            startActivity(intent)
        }
       dart.setOnClickListener()
       {
           intent= Intent(this,DartActivity::class.java)
           startActivity(intent)
       }



    }
}