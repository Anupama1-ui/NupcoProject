package com.skyview.nupcoemployeeapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplaschScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splasch_screen)
        val handler = Handler()
        handler.postDelayed({
            val i = Intent(this@SplaschScreen, LoginActivity::class.java)
            startActivity(i)
            finish()
        }, 3000)
    }
}