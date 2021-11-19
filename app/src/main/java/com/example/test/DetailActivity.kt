package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    private lateinit var tvJudulNama : TextView
    private lateinit var tvAbout : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        var animal : Bundle? = null;
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        animal = intent.extras

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = animal?.getString("Nama")

        tvJudulNama = findViewById(R.id.tv_animal_name)
        tvAbout = findViewById(R.id.tv_detail_about)

        tvJudulNama.text = animal?.getString("Nama")
        tvAbout.text = animal?.getString("About")

    }
}