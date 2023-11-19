package com.example.newtask

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.newtask.databinding.ActivityMain2Binding


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding:ActivityMain2Binding=
            DataBindingUtil.setContentView(this, R.layout.activity_main2)


        val fieldImae=binding.imageSecond
        val fieldText=binding.textSecond
        val callintent=intent
        fieldText.text=callintent.getStringExtra("name")
        fieldImae.setImageResource(callintent.getIntExtra("imageRe", R.drawable.default_image))
    }
}