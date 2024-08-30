package com.example.dymachap7.mvc.view

import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dymachap7.R

class TodoViewHolder(val itemView: View): RecyclerView.ViewHolder(itemView) {
    val todoTitleTextView = itemView.findViewById<TextView>(R.id.todo_title)
    val todoCheckBox: CheckBox = itemView.findViewById(R.id.todo_checkbox)

}