package com.tw.wallpaperdemo

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class WelcomeScreen : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome_screen)

        Handler(Looper.getMainLooper()).postDelayed(Runnable {
            val i = Intent(this@WelcomeScreen, WallpaperScreen::class.java)
            startActivity(i)
            finish()
        }, 2000)

    }


}