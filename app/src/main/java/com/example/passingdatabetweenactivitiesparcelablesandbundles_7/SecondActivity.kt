package com.example.passingdatabetweenactivitiesparcelablesandbundles_7


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val person = intent.getSerializableExtra("EXTRA_PERSON") as Person
        textViewPerson.text = person.toString()

    }
}