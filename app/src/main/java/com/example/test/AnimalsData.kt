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
    private val animalsAbout = arrayOf(
        "Koala Arnan (Phascolarctos cinereus) adalah salah satu binatang berkantung (marsupial) khas dari Australia dan merupakan wakil satu-satunya dari keluarga Phascolarctidae. Pada umumnya, banyak dikatakan bahwa kata koala berasal dari bahasa Australia pribumi yang berarti tidak minum. Koala sebenarnya minum air tetapi sangat jarang karena makanannya, daun ekaliptus, sudah mengandung cukup air sehingga koala tidak perlu turun dari pohon untuk minum. Koala dapat ditemukan di sepanjang pesisir timur Australia mulai dari Adelaide sampai ke Semenanjung Cape York, dan sampai jauh ke pedalaman karena terdapat curah hujan yang cukup untuk mendukung hutan yang cocok bagi koala",
        "Kucing disebut juga kucing domestik[4][5] atau kucing rumah (nama ilmiah: Felis silvestris catus atau Felis catus) adalah sejenis mamalia karnivora dari keluarga Felidae. Kata kucing biasanya merujuk kepada kucing yang telah dijinakkan,[6] tetapi bisa juga merujuk kepada kucing besar seperti singa dan harimau. Kucing telah berbaur dengan kehidupan manusia paling tidak sejak 6.000 tahun SM, dari kerangka kucing di Pulau Siprus Sejak zaman 3.500 SM, orang Mesir Kuno telah menggunakan kucing untuk menjauhkan tikus atau hewan pengerat lain dari lumbung yang menyimpan hasil panen.Saat ini, kucing adalah salah satu hewan peliharaan terpopuler di dunia. Kucing yang garis keturunannya tercatat secara resmi sebagai kucing trah atau galur murni (pure breed), seperti persia, siam, manx, dan sphinx. Kucing seperti ini biasanya dibiakkan di tempat pemeliharaan hewan resmi. Jumlah kucing ras hanyalah 1% dari seluruh kucing di dunia, sisanya adalah kucing dengan keturunan campuran seperti kucing liar atau kucing kampung.",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
    )
    val listData : ArrayList<Animals>
    get() {
        val list = arrayListOf<Animals>()
        for (position in animalsName.indices){
            val animals = Animals()
            animals.name = animalsName[position]
            animals.detail = animalsDetail[position]
            animals.about = animalsAbout[position]
            animals.photo = images[position]
            list.add(animals)
        }
        return list
    }
}