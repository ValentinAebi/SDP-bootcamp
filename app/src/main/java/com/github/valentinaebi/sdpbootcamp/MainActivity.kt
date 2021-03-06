package com.github.valentinaebi.sdpbootcamp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

const val EXTRA_NAME = "com.github.valentinaebi.sdpbootcamp.main.name"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun displayGreeting(view: View) {
        val mainNameField = findViewById<EditText>(R.id.mainName)
        val intent = Intent(this, GreetingActivity::class.java).apply {
            putExtra(EXTRA_NAME, mainNameField.text.toString())
        }
        startActivity(intent)
    }

}