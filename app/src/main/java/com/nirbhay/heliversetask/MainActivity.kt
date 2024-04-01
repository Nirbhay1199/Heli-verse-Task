package com.nirbhay.heliversetask

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.statusBarColor = ContextCompat.getColor(this, com.google.android.material.R.color.mtrl_btn_transparent_bg_color)
    }
}