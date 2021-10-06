package com.example.homework010

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework010.databinding.ItemViewBinding

class ViewPagerAdapter() :
    RecyclerView.Adapter<ViewPagerAdapter.PagerViewHolder>() {

    private val list = mutableListOf<ItemData>()

    fun setData(itemList: MutableList<ItemData>) {
        this.list.clear()
        this.list.addAll(itemList)
        notifyDataSetChanged()




    }


    inner class PagerViewHolder(private val binding: ItemViewBinding) :
        RecyclerView.ViewHolder(binding.root) {



        private lateinit var item: ItemData
        fun onBind() {
            item = list[adapterPosition]
            binding.ivTitle.text = item.title
            binding.ivDescription.text = item.description
            binding.image.setImageResource(item.image)
            binding.ivNumbers.text = "#${adapterPosition + 1} from ${list.size}" //to resources. later.
                                                                                // https://developer.android.com/guide/topics/resources/string-resource

        }


    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewPagerAdapter.PagerViewHolder {
        return PagerViewHolder(
            ItemViewBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )


    }

    override fun onBindViewHolder(holder: ViewPagerAdapter.PagerViewHolder, position: Int) {

        holder.onBind()


    }

    override fun getItemCount(): Int {
        return list.size
    }
}