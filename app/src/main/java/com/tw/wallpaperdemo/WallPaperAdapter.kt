package com.tw.wallpaperdemo

import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class WallPaperAdapter(c:Context, list: MutableList<WallPaperData>): RecyclerView.Adapter<WallPaperAdapter.WallpaperVH>() {

    var context: Context
    var MList: MutableList<WallPaperData>


    inner class WallpaperVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val ivImg = itemView.findViewById<ImageView>(R.id.ivImg)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WallpaperVH {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.wall_paper_item, parent, false)
        return WallpaperVH(view)
    }

    override fun getItemCount(): Int {
        return MList.size
    }

    override fun onBindViewHolder(holder: WallpaperVH, position: Int) {
        val data = MList[position]

        holder.ivImg.setImageResource(data.img)

        holder.ivImg.setOnClickListener {
            val wallInt = Intent(context, MainActivity::class.java)
            wallInt.putExtra("IMG", data.img)
            context.startActivity(wallInt)
        }
    }

    init {
        this.context = c
        this.MList = list
        notifyDataSetChanged()
    }
}