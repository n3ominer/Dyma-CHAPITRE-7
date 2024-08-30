package com.example.dymachap7.mvp.view

import com.example.dymachap7.mvp.model.Product

interface ProductView {
    fun showProducts(product: List<Product>)
    fun showError(message: String)
}