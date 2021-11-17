package com.example.test

object AnimalsData {
    private val animalsName = arrayOf(
        "Koala",
        "Kucing",
        "Kambing",
        "Burung Merak",
        "Kuda",
        "Gajah",
        "Kuda Nil",
        "Burung Elang",
        "Paus Biru",
        "Hiu Martil"
    )
    private val animalsDetail = arrayOf(
        "Koala(Phascolarctos cinereus) merupakan binatang berkantung (marsupial) khas dari Australia.",
        "Kucing adalah jenis mamalia golongan karnivora yang berasal dari keluarga Felidae.",
        "Kambing merupakan hewan mamalia yang masuk ke dalam golongan herbivora.",
        "Merak adalah spesies burung dalam genus Pavo dan Afropavo dari familia Phasianidae.",
        "Kuda adalah salah satu dari sepuluh spesies modern mamalia dari genus Equus.",
        "Gajah adalah mamalia besar dari famili Elephantidae dan ordo Proboscidea.",
        "Kuda nil atau badak air adalah mamalia dari keluarga Hippopotamidae omnivora.",
        "Elang adalah burung pemangsa berukuran besar dari suku Accipitridae terutama genus Aquila.",
        "Paus biru adalah mamalia laut yang tergolong dalam subordo paus balin.",
        "Hiu martil dari genus Sphyrna adalah anggota dari famili Sphyrnidae."
    )
    private val images = intArrayOf(
        R.drawable.koala,
        R.drawable.kucing,
        R.drawable.goat,
        R.drawable.merak,
        R.drawable.kuda,
        R.drawable.gajah,
        R.drawable.kudanil,
        R.drawable.elang,
        R.drawable.paus,
        R.drawable.hiumartil
    )
    val listData : ArrayList<Animals>
    get() {
        val list = arrayListOf<Animals>()
        for (position in animalsName.indices){
            val animals = Animals()
            animals.name = animalsName[position]
            animals.detail = animalsDetail[position]
            animals.photo = images[position]
            list.add(animals)
        }
        return list
    }
}