package com.example.menghitungbangunruang.persegiPanjang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.menghitungbangunruang.R

class PersegiPanjang : AppCompatActivity() {

    private lateinit var Panjang : EditText
    private lateinit var Lebar : EditText
    private lateinit var Luas : RadioButton
    private lateinit var Keliling : RadioButton
    private lateinit var proses : Button
    private lateinit var RecyclerView : RecyclerView
    private lateinit var RecyclerAdapter : RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    private var rumus : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persegi_panjang)

        Panjang = findViewById(R.id.etPanjang)
        Lebar = findViewById(R.id.etLebar)
        Luas = findViewById(R.id.rbLuas)
        Keliling = findViewById(R.id.rbKeliling)
        proses = findViewById(R.id.btnHasil)

        RecyclerView = findViewById(R.id.listData)

        // Memasukkan data kedalam adapter
        val persegiPanjang = ArrayList<DataPersegiPanjang>()
        viewManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        RecyclerAdapter = AdapterPersegiPanjang(persegiPanjang)
        RecyclerView.adapter = RecyclerAdapter
        RecyclerView.layoutManager = viewManager

        proses.setOnClickListener {
            val panjang = Panjang.text.toString().toInt()
            val lebar = Lebar.text.toString().toInt()
            var rb = ""

            if (Keliling.isChecked) {
                rumus = (panjang * lebar)
                rb = "Keliling"
                rumus.toString()+"cm"

            } else if(Luas.isChecked){
                rumus = ((2 * panjang)+(2 * lebar))
                rb = "Luas"
                rumus.toString()+"cm"
            }
            val dataa = DataPersegiPanjang(panjang,lebar,rb,rumus)
            persegiPanjang.add(dataa)
            RecyclerAdapter.notifyDataSetChanged()
        }


    }
}