package com.example.tugas2hubert

import android.annotation.SuppressLint
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
    private lateinit var listSepatu : ArrayList<ItemData>

    @SuppressLint("MissingInflatedId")
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

        listSepatu.add(ItemData(R.drawable.image1, nama = "NIKE TN AIR MAX PLUS BLACK", desc = "Rp. 2.779.000"))
        listSepatu.add(ItemData(R.drawable.image2, nama = "NIKE TN AIR MAX PLUS DRIFT", desc = "Rp. 2.218.000"))
        listSepatu.add(ItemData(R.drawable.image3, nama = "NIKE TN AIR MAX PLUS SE RED", desc = "Rp. 2.278.000"))
        listSepatu.add(ItemData(R.drawable.image4, nama = "ADIDAS YEZZY BOOST 350 V2 BRED", desc = "Rp. 7.500.000"))
        listSepatu.add(ItemData(R.drawable.image5, nama = "ADIDAS YEZZY BOOST 350 V2 OREO", desc = "Rp. 16.379.000"))
        listSepatu.add(ItemData(R.drawable.image6, nama = "ADIDAS YEZZY BOOST 350 V2 CORE", desc = "Rp. 6.799.000"))
        listSepatu.add(ItemData(R.drawable.image7, nama = "NIKE X AIR MAX 720 BLACK", desc = "Rp. 1.599.000"))
        listSepatu.add(ItemData(R.drawable.image8, nama = "NIKE X AIR MAX REFLECTIVE BLACK", desc = "Rp. 1.650.000"))
        listSepatu.add(ItemData(R.drawable.image9, nama = "BALENCIAGA TRIPLE S BWR", desc = "Rp. 12.000.000"))
        listSepatu.add(ItemData(R.drawable.image10, nama = "BALENCIAGA TRIPLE S BLACK", desc = "Rp. 15.999.000"))




        sepatuRecyclerView.layoutManager = LinearLayoutManager(this)
        sepatuRecyclerView.setHasFixedSize(true)
        sepatuAdapter = MyAdapter(listSepatu)
        sepatuRecyclerView.adapter = sepatuAdapter
    }
}