package com.example.tugas2hubert

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tugas2hubert.databinding.ActivityMainBinding
import com.example.tugas2hubert.databinding.ActivityMiddleBinding

class MiddleActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMiddleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_middle)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding = ActivityMiddleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttontgs3.setOnClickListener {
            val intentMain = Intent(this, HomeActivity::class.java)
            startActivity(intentMain)
        }

        binding.buttontgs4.setOnClickListener {
            val intentMain = Intent(this, RecyclerActivity::class.java)
            startActivity(intentMain)
        }
    }
}