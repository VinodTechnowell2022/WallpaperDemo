package com.tw.wallpaperdemo

import android.app.WallpaperManager
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ivImage = findViewById<ImageView>(R.id.ivImage)
        val btnImageView = findViewById<AppCompatButton>(R.id.btnImageView)
        val img :Int = intent.extras!!.getInt("IMG")
        ivImage.setImageResource(img)

        btnImageView.setOnClickListener {
            setWallpaper(img)
        }

    }

    private fun setWallpaper(img: Int) {
        try {
            val wpm =WallpaperManager.getInstance(this@MainActivity)
            wpm.setResource(img)
            Toast.makeText(this, "wallpaper set", Toast.LENGTH_SHORT).show()
        } catch (e: Exception) {
            Log.e(this.javaClass.simpleName, "setWallpaper exception : ${e.stackTrace}", )
        }
    }


}