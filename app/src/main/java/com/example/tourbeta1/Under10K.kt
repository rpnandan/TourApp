package com.example.tourbeta1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Under10K : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_under10_k)

//        experimental testing
        val travelAdvisoryShimla = findViewById<TextView>(R.id.travelAdvisoryShimla)
        travelAdvisoryShimla.setOnClickListener {
            val intent = Intent (this@Under10K,AdvisoryHP::class.java)
            startActivity(intent)

        }

        val travelAdvisoryChandigarh = findViewById<TextView>(R.id.travelAdvisoryChandigarh)
        travelAdvisoryChandigarh.setOnClickListener {
            val intent = Intent (this@Under10K,AdvisoryPunjab::class.java)
            startActivity(intent)

        }

        val travelAdvisoryJaipur = findViewById<TextView>(R.id.travelAdvisoryJaipur)
        travelAdvisoryJaipur.setOnClickListener {
            val intent = Intent (this@Under10K,AdvisoryRajasthan::class.java)
            startActivity(intent)

        }

        val travelAdvisoryAmritsar = findViewById<TextView>(R.id.travelAdvisoryAmritsar)
        travelAdvisoryAmritsar.setOnClickListener {
            val intent = Intent (this@Under10K,AdvisoryPunjab::class.java)
            startActivity(intent)

        }

        val travelAdvisoryAgra = findViewById<TextView>(R.id.travelAdvisoryAgra)
        travelAdvisoryAgra.setOnClickListener {
            val intent = Intent (this@Under10K,AdvisoryUP::class.java)
            startActivity(intent)

        }
    }
}