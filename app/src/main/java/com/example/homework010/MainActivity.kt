package com.example.homework010

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.homework010.databinding.ActivityMainBinding

typealias image = R.drawable

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    val itemList = mutableListOf<ItemData>(
        ItemData(image.birds, "Birds", "birds sitting on the roof"),
        ItemData(image.cat, "Cat", "this was evil cat indeed"),
        ItemData(image.birds, "Birds", "birds sitting on the roof"),
        ItemData(image.birds, "Birds", "birds sitting on the roof")
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val viewPagerAdaper = ViewPagerAdapter(itemList)
        val indicator = binding.CircularIndicator

        binding.ViewPager2.adapter = viewPagerAdaper
        binding.ViewPager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL //default

        indicator.setViewPager(binding.ViewPager2)
    }
}