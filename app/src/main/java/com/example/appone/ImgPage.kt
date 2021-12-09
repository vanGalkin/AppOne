package com.example.appone

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class ImgPage : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_img)
    }
    override fun onDestroy() {
        super.onDestroy()
    }

}