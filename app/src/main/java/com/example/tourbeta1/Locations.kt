package com.example.tourbeta1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Locations : AppCompatActivity() {

    private lateinit var locationDelhi: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_locations)

        locationDelhi = findViewById(R.id.locationDelhi)

        locationDelhi.setOnClickListener {
            val intent = Intent(this@Locations, PriceRange::class.java)
            startActivity(intent)
        }
    }
}