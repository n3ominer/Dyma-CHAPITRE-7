package com.example.dymachap7.observer.view

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dymachap7.R

class ProductViewHolder(val itemView: View): RecyclerView.ViewHolder(itemView) {
    val productTitlteTv: TextView = itemView.findViewById(R.id.product_title_tv)
    val productPriceTv: TextView = itemView.findViewById(R.id.product_prive_tv)
}