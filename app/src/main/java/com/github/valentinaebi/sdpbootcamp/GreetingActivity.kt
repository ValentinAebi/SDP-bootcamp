package com.github.valentinaebi.sdpbootcamp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GreetingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting)
        val greetingGreetingDisplay = findViewById<TextView>(R.id.greetingGreetingDisplay)
        val name = intent.getStringExtra(EXTRA_NAME)
        greetingGreetingDisplay.apply {
            text = getString(R.string.greeting_msg, name)
        }
    }

}