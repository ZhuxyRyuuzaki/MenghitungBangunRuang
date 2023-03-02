package com.example.menghitungbangunruang

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.menghitungbangunruang.persegiPanjang.PersegiPanjang

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toPersegiPanjang(view: View) {
        val pindah = Intent(this, PersegiPanjang::class.java)
        startActivity(pindah)
    }

}