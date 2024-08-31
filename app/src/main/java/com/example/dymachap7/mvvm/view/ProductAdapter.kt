package com.example.dymachap7.mvvm.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dymachap7.R
import com.example.dymachap7.mvp.model.Product

class ProductAdapter(val products: List<Product>): RecyclerView.Adapter<ProductViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_rv_cell, parent, false)
        return ProductViewHolder(view)
    }

    override fun getItemCount(): Int {
        return products.size
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val data = this.products[position]

        holder.productTitle.text = data.name
        holder.productPrice.text = holder.itemView.context.getString(R.string.product_price, data.price)
    }

}