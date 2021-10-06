package com.example.homework010

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.homework010.databinding.ActivityMainBinding

typealias image = R.mipmap

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private val viewPagerAdapter = ViewPagerAdapter()

    private val itemList = mutableListOf<ItemData>(
        ItemData(image.cat, "Cat", "this was evil cat indeed"),
        ItemData(image.man, "Man on the bench", "lisbon, very hot day of july"),
        ItemData(image.cat2, "Cat2", "this was evil cat indeed"),
        ItemData(image.birds, "Birds", "birds sitting on the roof"),
        ItemData(image.bikes, "Bikes", "I don't believe in Peter Pan")
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)




        viewPagerAdapter.setData(itemList)  //set data to viewPagerAdapter.
        // val indicator = binding.CircularIndicator  //in case we need to implement circular indicator.
        binding.ViewPager2.adapter = viewPagerAdapter
        binding.ViewPager2.orientation = ViewPager2.ORIENTATION_VERTICAL //default is horizontal

        // indicator.setViewPager(binding.ViewPager2) //in case we need to implement circular indicator
    }
}