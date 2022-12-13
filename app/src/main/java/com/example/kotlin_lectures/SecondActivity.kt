package com.example.kotlin_lectures

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    var txtset:String?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        txtset= findViewById<TextView>(R.id.textView).setText(intent.getStringExtra("key")).toString()

    }
}