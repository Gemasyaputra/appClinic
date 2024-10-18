package com.gema.latihan_12.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gema.latihan_12.R
import com.gema.latihan_12.model.ModelListDoctors

class AdapterListDoctor(
    val itemDoctorList: List<ModelListDoctors>
): RecyclerView.Adapter<AdapterListDoctor.MyViewHolder>()
{
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgDoctor = itemView.findViewById<ImageView>(R.id.imgItemDoctor)
        var txtNamaDr = itemView.findViewById<TextView>(R.id.txtItemNamaDr)
        var txtBidangDr = itemView.findViewById<TextView>(R.id.txtItemBidangDr)
        var txtTotalReview = itemView.findViewById<TextView>(R.id.txtItemJumlahReview)
        var txttotalRating = itemView.findViewById<TextView>(R.id.txtItemJumlahRating)


    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AdapterListDoctor.MyViewHolder {
       val nView = LayoutInflater.from(parent.context)
           .inflate(R.layout.item_doctor, parent, false)
        return MyViewHolder(nView)
    }

    override fun onBindViewHolder(holder: AdapterListDoctor.MyViewHolder, position: Int) {
       val currentItem = itemDoctorList[position]
        holder.imgDoctor.setImageResource(currentItem.ImageDr)
        holder.txtNamaDr.setText(currentItem.NamaDr)
        holder.txtBidangDr.setText(currentItem.BidangDr)
        holder.txtTotalReview.setText(currentItem.totalReview)
        holder.txttotalRating.setText(currentItem.totalRating)


    }

    override fun getItemCount(): Int {
     return itemDoctorList.size
    }
}