package com.example.dymachap7.observer

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.dymachap7.mvp.model.Product

class ProductViewModel: ViewModel() {

    private val _products = MutableLiveData<List<Product>>()
    val products: LiveData<List<Product>> get() = _products


    fun loadProducts() {
        _products.value = listOf(
            Product(1, "Produit 1", 10.0),
            Product(2, "Produit 2", 20.0),
            Product(3, "Produit 3", 30.0),
        )
    }
}