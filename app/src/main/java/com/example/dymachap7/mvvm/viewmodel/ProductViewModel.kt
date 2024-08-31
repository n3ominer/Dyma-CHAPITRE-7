package com.example.dymachap7.mvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.dymachap7.mvp.model.Product
import com.example.dymachap7.mvvm.repository.ProductRepository

class ProductViewModel: ViewModel() {
    private val productRepository = ProductRepository()

    // Des observables pour notifier la vue
    private val _products = MutableLiveData<List<Product>>()
    val products: LiveData<List<Product>> get() = _products

    fun loadProducts() {
        val productsData = productRepository.getProducts()
        // Traitement un supplémentaire éventuel

        this._products.value = productsData
    }
}