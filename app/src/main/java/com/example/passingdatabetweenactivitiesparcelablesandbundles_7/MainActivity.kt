package com.example.passingdatabetweenactivitiesparcelablesandbundles_7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonApply.setOnClickListener {
            val name = editTextName.text.toString()
            val age = editTextAge.text.toString().toInt()
            val country = editTextCountry.text.toString()
            val person = Person(name, age, country)
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("EXTRA_PERSON", person)
            startActivity(intent)
        }
    }
}