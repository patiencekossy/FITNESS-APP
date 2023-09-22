package com.example.fitness

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ViewSwitcher
import androidx.appcompat.app.AppCompatActivity


class StartActivity : AppCompatActivity() {
    private var viewSwitcher: ViewSwitcher? = null
    private var startButton: Button? = null
    private var pauseButton: Button? = null
    private var cancelButton: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start2)
        viewSwitcher = findViewById(R.id.viewSwitcher)
        startButton = findViewById(R.id.startButton)
        pauseButton = findViewById(R.id.pauseButton)
        cancelButton = findViewById(R.id.cancelButton)

        // Set the initial button click listeners
        startButton?.setOnClickListener(View.OnClickListener { // Switch to the second view (Pause and Cancel buttons)
            viewSwitcher?.showNext()
        })
        pauseButton?.setOnClickListener(View.OnClickListener {
            // Add your pause logic here
        })
        cancelButton?.setOnClickListener(View.OnClickListener {
            // Add your cancel logic here
        })
    }
}
