package com.tw.wallpaperdemo

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class WallpaperScreen : AppCompatActivity() {

    private lateinit var recView: RecyclerView
    private lateinit var adapter: WallPaperAdapter
    private var list: MutableList<WallPaperData> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.wallpaper_screen)

        recView = findViewById(R.id.mainRecView)
        addList()
    }

    private fun addList() {

        list.add(WallPaperData(R.drawable.wallpaper_one))
        list.add(WallPaperData(R.drawable.wallpaper_two))
        list.add(WallPaperData(R.drawable.wallpaper_three))
        list.add(WallPaperData(R.drawable.wallpaper_four))
        list.add(WallPaperData(R.drawable.wallpapre_seven))


        if (list.size>0){
            Log.e(this.javaClass.simpleName, "addList: ${list.size}", )
            adapter = WallPaperAdapter(this, list)
            recView.setHasFixedSize(true)
            val layoutManager = GridLayoutManager(this@WallpaperScreen, 2)
            recView.layoutManager = layoutManager
            recView.adapter = adapter
            adapter.notifyDataSetChanged()
        }
    }


}