package com.example.uranaiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tv:TextView = findViewById(R.id.uranaiText)
        var btn: Button = findViewById(R.id.uranaiButton)

        btn.setOnClickListener{
            var uranai = arrayOf("大吉","中吉","吉","凶")
            var num = Random().nextInt(uranai.count())
            //tv.text = num.toString()
            tv.text = uranai.get(num)
        }
    }
}