package com.implude.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class Adapter(val profileList: ArrayList<Profiles>) : RecyclerView.Adapter<Adapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        holder.profile.setImageResource(profileList.get(position).profile)
        holder.name.text = profileList.get(position).name
        holder.id.text = profileList.get(position).id
    }

    override fun getItemCount(): Int {
        return profileList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val profile = itemView.findViewById<ImageView>(R.id.profile)
        val name = itemView.findViewById<TextView>(R.id.name)
        val id = itemView.findViewById<TextView>(R.id.id)
    }

}