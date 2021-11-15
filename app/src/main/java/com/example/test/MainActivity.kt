package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var list:ArrayList<Animals> = arrayListOf()
    private lateinit var rvAnimals : RecyclerView
    private lateinit var koala : CardView
    private fun showRecyclerCardView(){
        rvAnimals.layoutManager = LinearLayoutManager(this)
        val cardViewAnimalAdapter = CardViewAnimalAdapter(list)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "GOLBOG"
        koala = findViewById(R.id.card_koala)

        koala.setOnClickListener(this)
        rvAnimals = findViewById(R.id.rv_animals)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.profile){
            startActivity(Intent(this,About::class.java))
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.card_koala->{
                startActivity(Intent(this,DetailActivity::class.java))
            }
        }
    }
}