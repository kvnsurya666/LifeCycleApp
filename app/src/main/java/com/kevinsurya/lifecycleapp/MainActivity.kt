package com.kevinsurya.lifecycleapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var myButton: Button
    lateinit var openWeb:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Intents : used to navigate from one component to another

//        Types of Intents :
//        1- Explicit: they explicitlyv specify the target component
//        2- Implicit

        myButton = findViewById(R.id.goToNextBtn)
        myButton.setOnClickListener {
            val explicitIntent = Intent(this, SecondActivity::class.java)

            explicitIntent.putExtra("myname","Jack")

            startActivity(explicitIntent)
        }

        openWeb = findViewById(R.id.openWebBtn)
        openWeb.setOnClickListener {

//            Create implicit intent with the action
//            VIEW and a URL
            val implicitIntent = Intent(
                Intent.ACTION_VIEW, Uri.parse("https://www.google.com")
            )
            startActivity(implicitIntent)
        }

    }
}