package com.example.mekubus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.mekubus.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val edtSisi = findViewById<EditText>(R.id.edt_sisi)
        val btnHitung = findViewById<Button>(R.id.btn_hitung)
        val tvHasil = findViewById<TextView>(R.id.tv_hasil)

        btnHitung.setOnClickListener {
            val sisi = edtSisi.text.toString().toDouble()
            val kubus = KubusAdapter(sisi)
            val volume = kubus.hitungVolume()

            tvHasil.text = "Volume kubus adalah $volume"
        }
    }
}