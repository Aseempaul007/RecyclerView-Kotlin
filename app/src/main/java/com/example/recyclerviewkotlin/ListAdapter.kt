package com.example.recyclerviewkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.recyclerviewkotlin.databinding.ListItemBinding

class ListAdapter(var dataList: ArrayList<Model>, var context: Context): RecyclerView.Adapter<ListAdapter.ListViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        var listBinding= ListItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return ListViewHolder(listBinding)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.listBinding.listImage.setImageResource(dataList.get(position).image)
        holder.listBinding.listTitle.setText(dataList.get(position).titleText)
        holder.listBinding.listSubTitle.setText(dataList.get(position).subText)

        holder.itemView.setOnClickListener {
            Toast.makeText(context,"Item Clicked ${position}",Toast.LENGTH_SHORT).show()
        }
    }

    inner class ListViewHolder(var listBinding: ListItemBinding) : RecyclerView.ViewHolder(listBinding.root) {


    }
}