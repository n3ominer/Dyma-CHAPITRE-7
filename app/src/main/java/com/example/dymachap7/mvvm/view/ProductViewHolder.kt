package com.example.dymachap7.mvvm.view

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dymachap7.R

class ProductViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val productTitle = itemView.findViewById<TextView>(R.id.product_title_tv)
    val productPrice = itemView.findViewById<TextView>(R.id.product_prive_tv)
}