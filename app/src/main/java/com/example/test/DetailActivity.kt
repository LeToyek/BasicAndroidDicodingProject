package com.example.test

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    private lateinit var tvJudulNama : TextView
    private lateinit var tvAbout : TextView
    private lateinit var tvIlmiah : TextView
    private lateinit var ivMainPic : ImageView
    private lateinit var image1 : ImageView
    private lateinit var image2 : ImageView
    private lateinit var image3 : ImageView
    private lateinit var tvMakanan : TextView
    private lateinit var tvHabitat : TextView
    private lateinit var tvUmur : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        var animal : Bundle? = null;
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        animal = intent.extras

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = animal?.getString("Nama")

        tvJudulNama = findViewById(R.id.tv_animal_name)
        tvAbout = findViewById(R.id.tv_detail_about)
        tvIlmiah = findViewById(R.id.tv_animal_greekName)
        ivMainPic = findViewById(R.id.main_image)
        tvMakanan = findViewById(R.id.makanan)
        tvHabitat = findViewById(R.id.habitat)
        tvUmur = findViewById(R.id.usia)
        image1 = findViewById(R.id.photo1)
        image2 = findViewById(R.id.photo2)
        image3 = findViewById(R.id.photo3)


        tvJudulNama.text = animal?.getString("Nama")
        tvAbout.text = animal?.getString("About")
        tvIlmiah.text = animal?.getString("Nama Ilmiah")
        tvMakanan.text = animal?.getString("makanan")
        tvHabitat.text = animal?.getString("habitat")
        tvUmur.text = animal?.getString("usia") + " tahun"
        image1.setImageResource(animal?.getInt("image1",0) as Int)
        image2.setImageResource(animal?.getInt("image2",0) as Int)
        image3.setImageResource(animal?.getInt("main image",0)as Int)
        ivMainPic.setImageResource(animal?.getInt("main image",0) as Int)



    }
}