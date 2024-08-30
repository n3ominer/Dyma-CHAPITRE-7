package com.example.dymachap7.observer

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.dymachap7.R
import com.example.dymachap7.mvp.model.Product
import com.example.dymachap7.observer.view.ProductAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var productVm: ProductViewModel

    private lateinit var productRv: RecyclerView
    private lateinit var productAdapter: ProductAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        this.productVm = ProductViewModel()

        // Observe new events
        this.observeData()

        this.productVm.loadProducts()
    }


    private fun observeData() {
        this.productVm.products.observe(this) { products ->
            // Code qui va être executé à chaque nouvel événement
            this.setUpRv(products)
        }
    }

    private fun setUpRv(products: List<Product>) {
        this.productAdapter = ProductAdapter(products)

        this.productRv = findViewById(R.id.observer_rv)
        this.productRv.layoutManager = LinearLayoutManager(this)
        this.productRv.adapter = this.productAdapter
    }
}