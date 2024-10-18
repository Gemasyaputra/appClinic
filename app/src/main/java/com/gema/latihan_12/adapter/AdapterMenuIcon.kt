package com.gema.latihan_12.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gema.latihan_12.R
import com.gema.latihan_12.model.modelIcon

class AdapterMenuIcon
    (private val itemMenuList: List<modelIcon>) :
    RecyclerView.Adapter<AdapterMenuIcon.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // Inflate layout item_destination.xml (pastikan file XML ini ada)
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_menu, parent, false)
        return MyViewHolder(nView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = itemMenuList[position]
        holder.imgMenuIcon.setImageResource(currentItem.icon)
        holder.txtNamaMenu.setText(currentItem.iconName)
    }

    override fun getItemCount(): Int
    {
        return itemMenuList.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgMenuIcon: ImageView = itemView.findViewById(R.id.ImgMenuItem)
        val txtNamaMenu: TextView = itemView.findViewById(R.id.txtNamaMenu)

    }
}