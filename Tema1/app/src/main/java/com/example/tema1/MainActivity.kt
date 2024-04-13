package com.example.tema1

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.tema1.helpers.extensions.logErrorMessage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.btn_close_app)
        button.setOnClickListener { finish() }

        "onCreate".logErrorMessage()
    }

    override fun onStart() {
        super.onStart()

        "onStart".logErrorMessage()
    }

    override fun onResume() {
        super.onResume()

        "onResume".logErrorMessage()
    }

    override fun onPause() {
        super.onPause()

        "onPause".logErrorMessage()
    }

    override fun onStop() {
        super.onStop()

        "onStop".logErrorMessage()
    }

    override fun onDestroy() {
        super.onDestroy()

        "onDestroy".logErrorMessage()
    }
}
