package com.example.ictlifesample

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.question_2_item.view.*

class Question2Adapter(val context: Context, private val choices: List<String>): RecyclerView.Adapter<Question2Adapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.question_2_item, parent, false))
    }

    override fun getItemCount()= choices.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.choice_text.text = choices[position]

        holder.itemView.choice_text.setOnClickListener {
            holder.itemView.choice_text.setBackgroundColor(ContextCompat.getColor(context, android.R.color.darker_gray))
            holder.itemView.choice_text.setTextColor(ContextCompat.getColor(context, R.color.colorAccent))
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}