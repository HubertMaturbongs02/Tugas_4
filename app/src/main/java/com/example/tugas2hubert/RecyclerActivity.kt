package com.example.tugas2hubert

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerActivity : AppCompatActivity() {

    private lateinit var sepatuRecyclerView: RecyclerView
    private lateinit var sepatuAdapter: MyAdapter
    private lateinit var listSepatu: ArrayList<ItemData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycler)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        sepatuRecyclerView = findViewById(R.id.sepatuRV)
        listSepatu = ArrayList()

        listSepatu.add(ItemData(R.drawable.image1,  "NIKE TN AIR MAX PLUS BLACK", "Rp. 2.779.000",
            "NIKE TN Air Max Plus Black adalah sepatu ikonik yang memadukan gaya agresif dengan teknologi kenyamanan khas Nike. Dikenal dengan desain \"rib cage\" khas di bagian upper dan sol Air Max bertekanan tinggi, sepatu ini menawarkan tampilan futuristik yang tetap klasik. \n" +
                    "Warna hitamnya menambah kesan elegan dan misterius, cocok untuk pecinta streetwear yang ingin tampil bold tanpa mengorbankan kenyamanan. Cocok dipakai harian maupun sebagai statement fashion, Air Max Plus Black adalah simbol dari kekuatan dan gaya dalam satu langkah."))

        listSepatu.add(ItemData(R.drawable.image2,  "NIKE TN AIR MAX PLUS DRIFT", "Rp. 2.218.000",
            "Nike TN Air Max Plus Drift adalah evolusi modern dari siluet ikonik Air Max Plus, yang memadukan gaya berani dengan kenyamanan maksimal. \n" +
                    "Didesain dengan upper mesh yang ringan dan breathable, sepatu ini dilengkapi dengan caging plastik bergelombang yang terinspirasi dari pohon palem dan ombak laut, memberikan tampilan dinamis dan futuristik. \n" +
                    "Bagian midfoot-nya menampilkan lengkungan yang terinspirasi dari ekor paus, menambah stabilitas dan estetika unik. Dilengkapi dengan teknologi Tuned Air khas Nike, sepatu ini menawarkan bantalan ringan yang tahan lama, cocok untuk aktivitas sehari-hari maupun gaya streetwear yang mencolok."))

        listSepatu.add(ItemData(R.drawable.image3,  "NIKE TN AIR MAX PLUS SE RED", "Rp. 2.278.000",
            "\u200BNike TN Air Max Plus SE \"University Red\" adalah edisi spesial dari lini Air Max Plus yang menampilkan kombinasi warna berani dan desain retro. \n" +
                    "Sepatu ini memiliki dasar mesh biru langit yang dilapisi dengan cage TPU merah mencolok, terinspirasi dari siluet asli tahun 1998. Aksen kuning dan krem pada bagian lidah, outsole, dan detail \"AMRC\" (Air Max Running Club) memberikan sentuhan nostalgia yang mengingatkan pada estetika lari klasik era 1970-an "))

        listSepatu.add(ItemData(R.drawable.image4,  "ADIDAS YEZZY BOOST 350 V2 BRED", "Rp. 7.500.000",
            "Adidas Yeezy Boost 350 V2 'Bred' adalah salah satu varian paling ikonik dari seri Yeezy yang dirancang oleh Kanye West. Sepatu ini pertama kali dirilis pada 11 Februari 2017, dan kemudian mengalami restock pada 5 Desember 2020.\n" +
                    "\n" +
                    "Dikenal dengan desain minimalis dan warna yang mencolok, Yeezy Boost 350 V2 'Bred' menampilkan upper Primeknit berwarna hitam pekat dengan aksen tulisan \"SPLY-350\" berwarna merah cerah di sisi lateral. \n" +
                    "Bagian midsole menggunakan teknologi Boost yang memberikan kenyamanan maksimal, sementara outsole semi-translusen menambah kesan modern pada sepatu ini."))

        listSepatu.add(ItemData(R.drawable.image5,  "ADIDAS YEZZY BOOST 350 V2 OREO", "Rp. 16.379.000",
            "Adidas Yeezy Boost 350 V2 \"Oreo\" adalah salah satu varian paling ikonik dari seri Yeezy yang dirancang oleh Kanye West. Sepatu ini pertama kali dirilis pada 17 Desember 2016, dengan kode gaya BY1604, dan kemudian mengalami restock pada 12 Maret 2022. \u200B\n" +
                    "Dikenal dengan desain minimalis dan warna yang mencolok, Yeezy Boost 350 V2 \"Oreo\" menampilkan upper Primeknit berwarna hitam pekat dengan aksen tulisan \"SPLY-350\" berwarna putih cerah di sisi lateral. \n" +
                    "Bagian midsole menggunakan teknologi Boost yang memberikan kenyamanan maksimal, sementara outsole semi-translusen menambah kesan modern pada sepatu ini."))

        listSepatu.add(ItemData(R.drawable.image6,  "ADIDAS YEZZY BOOST 350 V2 CORE", "Rp. 6.799.000",
            "Adidas Yeezy Boost 350 V2 \"Core Black Red\" adalah salah satu varian paling ikonik dari seri Yeezy yang dirancang oleh Kanye West. Sepatu ini pertama kali dirilis pada 23 November 2016 dengan kode gaya BY9612, dan kemudian mengalami restock pada 12 Maret 2022.\n" +
                    "Dikenal dengan desain minimalis dan warna yang mencolok, Yeezy Boost 350 V2 \"Core Black Red\" menampilkan upper Primeknit berwarna hitam pekat dengan aksen tulisan \"SPLY-350\" berwarna merah cerah di sisi lateral. \n" +
                    "Bagian midsole menggunakan teknologi Boost yang memberikan kenyamanan maksimal, sementara outsole semi-translusen menambah kesan modern pada sepatu ini."))

        listSepatu.add(ItemData(R.drawable.image7,  "NIKE X AIR MAX 720 BLACK", "Rp. 1.599.000",
            "Nike Air Max 720 Black adalah salah satu varian dari seri Air Max 720 yang dirilis pada tahun 2019. \n" +
                    "Sepatu ini menonjol dengan desain minimalis serba hitam yang elegan, menciptakan tampilan yang bold namun tetap versatile. Bagian upper terbuat dari material mesh yang ringan dan breathable, sementara midsole-nya dilengkapi dengan unit udara penuh sepanjang 38mm, memberikan kenyamanan maksimal dan responsivitas tinggi."))

        listSepatu.add(ItemData(R.drawable.image8,  "NIKE X AIR MAX REFLECTIVE BLACK", "Rp. 1.650.000",
            "Nike Air Max Plus \"Black Reflective\" (kode gaya HQ3029-001) adalah edisi premium dari siluet ikonik Air Max Plus yang dirilis pada November 2024. Sepatu ini menampilkan desain serba hitam dengan aksen reflektif metalik perak, memberikan tampilan sleek dan futuristik. \n" +
                    "Bagian upper terbuat dari material mesh yang ringan dan breathable, sementara midsole-nya dilengkapi dengan unit udara penuh yang menawarkan kenyamanan maksimal. \n" +
                    "Desain cage TPU khas Air Max Plus tetap dipertahankan, memberikan stabilitas dan estetika yang kuat. Dengan kombinasi warna hitam dan aksen reflektif, sepatu ini cocok untuk gaya streetwear yang bold dan modern.\u200B"))

        listSepatu.add(ItemData(R.drawable.image9,  "BALENCIAGA TRIPLE S BWR", "Rp. 12.000.000",
            "Balenciaga Triple S BWR adalah varian dari sepatu Triple S yang dirilis ulang pada tahun 2018. Sepatu ini menampilkan kombinasi warna hitam, putih, dan merah, menciptakan desain yang bold dan ikonik. \n" +
                    "Dengan sol bertumpuk yang tebal dan desain yang mencolok, Triple S BWR menjadi simbol dari tren \"ugly sneaker\" yang mendominasi dunia mode saat itu."))

        listSepatu.add(ItemData(R.drawable.image10, "BALENCIAGA TRIPLE S BLACK", "Rp. 15.999.000",
            "Balenciaga Triple S Black adalah sepatu ikonik yang mengusung desain chunky dan futuristik, mencerminkan tren \"ugly sneaker\" yang mendominasi mode urban. \n" +
                    "Dirilis pertama kali pada tahun 2017, sepatu ini menjadi simbol dari pergeseran estetika dalam dunia streetwear."))

        sepatuRecyclerView.layoutManager = LinearLayoutManager(this)
        sepatuRecyclerView.setHasFixedSize(true)
        sepatuAdapter = MyAdapter(listSepatu)
        sepatuRecyclerView.adapter = sepatuAdapter

        sepatuAdapter.onItemClick = { selectedItem ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("item", selectedItem)
            startActivity(intent)
        }
    }
}
