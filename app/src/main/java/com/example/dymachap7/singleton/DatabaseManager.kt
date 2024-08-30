package com.example.dymachap7.singleton

import android.util.Log

object DatabaseManager {

    private var connection: String = "NOT CONNECTED"

    fun connect(connectionString: String) {
        connection = connectionString
        Log.d("Singleton", "Connecté à la base de donnée avec l'URL: $connectionString")
    }

    fun disconnect() {
        connection = "NOT CONNECTED"
        Log.d("Singleton", "La base de données est déconnectée")
    }

    fun isConnected(): Boolean = connection != "NOT CONNECTED"

}