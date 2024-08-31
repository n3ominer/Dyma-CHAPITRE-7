package com.example.dymachap7.mvvm

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dymachap7.R
import com.example.dymachap7.mvp.model.Product
import com.example.dymachap7.mvp.model.ProductModel
import com.example.dymachap7.mvvm.view.ProductAdapter
import com.example.dymachap7.mvvm.viewmodel.ProductViewModel

class MvvmMainActivity : AppCompatActivity() {

    lateinit var productsRv: RecyclerView
    lateinit var productsAdapter: ProductAdapter

    private var productVm = ProductViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_mvvm_main)

        this.productVm.products.observe(this) { products ->
            this.setUpRv(products)
        }

        this.productVm.loadProducts()
    }

    private fun setUpRv(products: List<Product>) {
        this.productsAdapter = ProductAdapter(products)

        this.productsRv = findViewById(R.id.products_recycler_view)
        this.productsRv.layoutManager = LinearLayoutManager(this)
        this.productsRv.adapter = this.productsAdapter
    }
}