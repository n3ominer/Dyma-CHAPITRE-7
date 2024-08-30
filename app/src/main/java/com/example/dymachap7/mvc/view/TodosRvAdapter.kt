package com.example.dymachap7.mvc.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dymachap7.R
import com.example.dymachap7.mvc.model.Todo

class TodosRvAdapter(private val todos: List<Todo>): RecyclerView.Adapter<TodoViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.todo_cell, parent,  false)
        return TodoViewHolder(view)
    }

    override fun getItemCount(): Int {
        return todos.size
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        val data = this.todos[position]

        holder.todoTitleTextView.text = data.title
        holder.todoCheckBox.isChecked = data.isFinished
    }

}