package com.example.gd3_c_0573

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.gd3_c_0573.entity.Mahasiswa

class RVMahasiswaAdapter (private val data : Array<Mahasiswa>): RecyclerView.Adapter<RVMahasiswaAdapter.viewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.activity_rvmahasiswa_adapter, parent, false)
        return viewHolder(itemView)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int){
        val currentItem = data[position]
        holder.tvName.text = currentItem.name
        holder.tvDetails.text = "${currentItem.tahunMasuk} - ${currentItem.IPK}"
    }

    override fun getItemCount(): Int{
        return data.size
    }

    class viewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val tvName : TextView = itemView.findViewById(R.id.tv_nama)
        val tvDetails : TextView = itemView.findViewById(R.id.tv_details)
    }

}