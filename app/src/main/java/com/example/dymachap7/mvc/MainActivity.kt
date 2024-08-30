package com.example.dymachap7.mvc

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dymachap7.R
import com.example.dymachap7.mvc.model.Todo
import com.example.dymachap7.mvc.view.TodosRvAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {

    lateinit var fab: FloatingActionButton
    lateinit var todosRv: RecyclerView
    lateinit var todoAdapter: TodosRvAdapter

    val todos = mutableListOf<Todo>(
        Todo("Todo 1", true),
        Todo("Todo 2", false),
        Todo("Todo 3", true)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        // Ajouter un FAB pour ajouter une nouvelle tâche
        this.fab = findViewById(R.id.main_activity_fab)

        this.handleAddingTodo()
        this.setUpRv()
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun handleAddingTodo() {
        this.fab.setOnClickListener {
            this.todos.add(Todo("Todo${Random.nextInt(0..100)}", true))
            this.todoAdapter.notifyDataSetChanged()
        }
    }

    private fun setUpRv() {
        // Implémenter la RV
        this.todosRv = findViewById(R.id.todos_recycler_view)
        // Gestion de l'adapter
        todoAdapter = TodosRvAdapter(todos)
        this.todosRv.layoutManager = LinearLayoutManager(this)
        this.todosRv.adapter = todoAdapter
    }
}