package com.example.dymachap7.mvp.view

import com.example.dymachap7.mvp.model.Product
import com.example.dymachap7.mvp.model.ProductModel

class ProductPresenter(private val view: ProductView) {

    private val productModel = ProductModel()

    fun loadProducts() {
        val products = productModel.getProducts()

        if(products.isNotEmpty()) {
            view.showProducts(products)
        } else {
            view.showError("Pas de produits à afficher")
        }
    }


}