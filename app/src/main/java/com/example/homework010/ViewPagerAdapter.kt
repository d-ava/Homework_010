package com.example.homework010

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework010.databinding.ItemViewBinding

class ViewPagerAdapter() :
    RecyclerView.Adapter<ViewPagerAdapter.Pager2ViewHolder>() {

    private val list = mutableListOf<ItemData>()

    fun setData(itemList: MutableList<ItemData>) {
        this.list.clear()
        this.list.addAll(itemList)
        notifyDataSetChanged()


       /* private val userList = mutableListOf<User>()

        fun setData(userList: MutableList<User>) {
            this.userList.clear()
            this.userList.addAll(userList)
            notifyDataSetChanged()*/


        }






    inner class Pager2ViewHolder(private val binding: ItemViewBinding) :
        RecyclerView.ViewHolder(binding.root) {

        /* var title: String = binding.ivTitle.text.toString()
         var description: String = binding.ivDescription.text.toString()
         var image = binding.image*/

        private lateinit var item: ItemData
        fun onBind() {
            item = list[adapterPosition]

            binding.ivTitle.text = item.title
            binding.ivDescription.text = item.description
            binding.image.setImageResource(item.image)


        }


    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewPagerAdapter.Pager2ViewHolder {
        return Pager2ViewHolder(
            ItemViewBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )


    }

    override fun onBindViewHolder(holder: ViewPagerAdapter.Pager2ViewHolder, position: Int) {

        holder.onBind()
        //holder.image.setImageResource(item.image)

    }

    override fun getItemCount(): Int {
        return list.size
    }
}