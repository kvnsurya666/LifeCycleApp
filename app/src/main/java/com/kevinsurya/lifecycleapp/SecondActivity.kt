package com.kevinsurya.lifecycleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    lateinit var titleTextView: TextView
    lateinit var myButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        titleTextView = findViewById(R.id.myTextView)
        myButton = findViewById(R.id.goBackToPreviousBtn)

//        Receive data from the Intent
        val receivedData = intent.getStringExtra("myname")

//        using the received data as needed
        titleTextView.text = "Welcome $receivedData to Second Activity"
        myButton.setOnClickListener {
            val explicitIntent = Intent(this, MainActivity::class.java)
            startActivity(explicitIntent)
        }

    }
}