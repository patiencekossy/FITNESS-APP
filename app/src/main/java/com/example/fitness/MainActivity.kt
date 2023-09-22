package com.example.fitness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers

class MainActivity : AppCompatActivity() {

    lateinit var cardview: CardView
    lateinit var button: Button
    lateinit var button2:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            Toast.makeText(this@MainActivity, "Button clicked!", Toast.LENGTH_SHORT).show()
            val button = findViewById<Button>(R.id.button)
            val button2 = findViewById<Button>(R.id.button2)

            button.setOnClickListener {
                val intent = Intent(this@MainActivity, WorkoutActivity::class.java)
                startActivity(intent)
            }
            button2.setOnClickListener {
                val intent = Intent(this@MainActivity, WorkoutActivity::class.java)
                startActivity(intent)
            }


}
        }
    }
