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
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "GOLBOG"
        rvAnimals = findViewById(R.id.rv_animals)
        rvAnimals.setHasFixedSize(true)

        list.addAll(AnimalsData.listData)
        showRecyclerCardView()

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

    private fun showRecyclerCardView(){
        rvAnimals.layoutManager = LinearLayoutManager(this)
        val listAnimalsAdapater = ListAnimalsAdapater(list)
        rvAnimals.adapter = listAnimalsAdapater
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }

}