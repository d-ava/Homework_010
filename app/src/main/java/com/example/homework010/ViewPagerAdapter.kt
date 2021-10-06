package com.example.homework010

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework010.databinding.ItemViewBinding

class ViewPagerAdapter(private var list: MutableList<ItemData>): RecyclerView.Adapter<ViewPagerAdapter.Pager2ViewHolder>() {

    inner class Pager2ViewHolder(private val binding: ItemViewBinding): RecyclerView.ViewHolder(binding.root){

        var title = binding.ivTitle.text
        var description= binding.ivDescription.text
        var image = binding.image

    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewPagerAdapter.Pager2ViewHolder {
       return Pager2ViewHolder(ItemViewBinding.inflate(LayoutInflater.from(parent.context), parent, false))




    }

    override fun onBindViewHolder(holder: ViewPagerAdapter.Pager2ViewHolder, position: Int) {
       var item = list[position]

        holder.title = item.description
        holder.description = item.description
        holder.image.setImageResource(item.image)

    }

    override fun getItemCount(): Int {
        return list.size
    }
}