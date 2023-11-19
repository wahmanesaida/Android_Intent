package com.example.newtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil

import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.newtask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding:ActivityMainBinding=
            DataBindingUtil.setContentView(this, R.layout.activity_main)


        val exemple=binding.myrecycler
        val mylist = ArrayList<StoreData>()
        mylist.add(StoreData(R.drawable.img, "flower1"))
        mylist.add(StoreData(R.drawable.img_1, "flower2"))
        mylist.add(StoreData(R.drawable.default_image, "flower3"))
        mylist.add(StoreData(R.drawable.img_2, "flower4"))
        mylist.add(StoreData(R.drawable.img_3, "flower5"))
        mylist.add(StoreData(R.drawable.img_4, "flower6"))
        val layoutmanager = GridLayoutManager(this, 3)
        exemple.layoutManager=layoutmanager
        val adapt=Myadapter(mylist)
        exemple.adapter=adapt








    }
}