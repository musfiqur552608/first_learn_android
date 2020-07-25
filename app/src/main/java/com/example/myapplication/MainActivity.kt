package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var textView_user = findViewById(R.id.show_text_view) as TextView
        var user_input = findViewById(R.id.user_input) as EditText
        var show_btn = findViewById(R.id.show_btn) as Button

        show_btn.setOnClickListener{
            var text = user_input.text.toString()

            textView_user.text = text
        }
    }
}