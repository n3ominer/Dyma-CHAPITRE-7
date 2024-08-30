package com.example.dymachap7.mvp.view

import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.dymachap7.R
import com.example.dymachap7.databinding.ActivityMainPresenterBinding
import com.example.dymachap7.mvp.model.Product

class MainActivityPresenter : AppCompatActivity(), ProductView {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainPresenterBinding

    private lateinit var productPresenter: ProductPresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainPresenterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val navController =
            findNavController(R.id.nav_host_fragment_content_main_activity_presenter)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        binding.fab.setOnClickListener { view ->
            /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null)
                .setAnchorView(R.id.fab).show()*/
            this.productPresenter.loadProducts()
        }

        this.productPresenter = ProductPresenter(this)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController =
            findNavController(R.id.nav_host_fragment_content_main_activity_presenter)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }

    override fun showProducts(product: List<Product>) {
        Toast.makeText(this, "${product.size} Produits disponibles", Toast.LENGTH_LONG).show()
    }

    override fun showError(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}