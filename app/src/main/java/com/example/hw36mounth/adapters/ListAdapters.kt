package com.example.hw36mounth.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.hw36mounth.databinding.ItemListBinding

class ListAdapters(private var data: ArrayList<String>) : RecyclerView.Adapter<ListAdapters.ListsViewHolder>() {

    inner class ListsViewHolder(private var binding: ItemListBinding) : ViewHolder(binding.root) {
        fun onBind(position: Int) {
            binding.tvList.text = data[position]
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListsViewHolder {
        return ListsViewHolder(ItemListBinding.inflate(LayoutInflater.from(parent.context) , parent , false))
    }

    override fun onBindViewHolder(holder: ListsViewHolder, position: Int) {
        holder.onBind(position)
    }

    override fun getItemCount(): Int = data.size
}