package com.example.menghitungbangunruang.persegiPanjang

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.menghitungbangunruang.R

class AdapterPersegiPanjang(private val dataset: ArrayList<DataPersegiPanjang>)
    : RecyclerView.Adapter<AdapterPersegiPanjang.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val panjang = view.findViewById<TextView>(R.id.panjang)!!
        val lebar = view.findViewById<TextView>(R.id.lebar)!!
        val keliling = view.findViewById<TextView>(R.id.keliling)!!
        val hasil = view.findViewById<TextView>(R.id.hasil)!!
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_adapter_persegi_panjang,parent,false)
        )
        /*val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_adapter_persegi_panjang,parent,false)
        return ViewHolder(view)*/
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = dataset[position]
        holder.panjang.text = data.Panjang.toString()
        holder.lebar.text = data.Lebar.toString()
        holder.keliling.text = data.Rb
        holder.hasil.text = data.Hasil.toString()
    }

    override fun getItemCount(): Int = dataset.size
}