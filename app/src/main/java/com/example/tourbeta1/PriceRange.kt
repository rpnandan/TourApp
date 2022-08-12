package com.example.tourbeta1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PriceRange : AppCompatActivity() {

    private lateinit var k10: Button
    private lateinit var k15: Button
    private lateinit var k25: Button
    private lateinit var k: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_price_range)

        k10 = findViewById(R.id.k10)
        k15 = findViewById(R.id.k15)
        k25 = findViewById(R.id.k25)
        k = findViewById(R.id.k)

        k10.setOnClickListener {
            val intent = Intent(this@PriceRange, Under10K::class.java)
            startActivity(intent)
        }

        k15.setOnClickListener {
            val intent = Intent(this@PriceRange, Under15K::class.java)
            startActivity(intent)
        }

        k25.setOnClickListener {
            val intent = Intent(this@PriceRange, Under25K::class.java)
            startActivity(intent)
        }

        k.setOnClickListener {
            val intent = Intent(this@PriceRange, UnderUnlimited::class.java)
            startActivity(intent)
        }

    }
}