package com.example.dymachap7.factory

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dymachap7.R

class FactoryMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_factory_main)

        val fragment = FragmentFactory.createFragment(FragmentType.Home)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.factory_fragment_container, fragment)
            .commit()

    }
}