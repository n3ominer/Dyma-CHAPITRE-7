package com.example.dymachap7.singleton

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.dymachap7.R

class SingletonMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_singleton_main)

        DatabaseManager.connect("mysqlurl://localhost:8000/myDb")

        if(DatabaseManager.isConnected()) {
            Toast.makeText(this, "La base de donnée est connectée", Toast.LENGTH_LONG).show()
        }

        DatabaseManager.disconnect()
    }
}