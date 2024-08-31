package com.example.dymachap7.mvvm.repository

import com.example.dymachap7.mvp.model.Product

class ProductRepository {

    fun getProducts():  List<Product> {
        return listOf(
            Product(1, "Produit n°1", 10.0),
            Product(2, "Produit n°2", 20.0),
            Product(3, "Produit n°3", 30.0),
        )
    }

}