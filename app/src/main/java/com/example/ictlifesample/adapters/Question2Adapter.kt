package com.example.ictlifesample.adapters

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.ictlifesample.R
import com.example.ictlifesample.fragments.MeasurementsFragment
import kotlinx.android.synthetic.main.question_2_item.view.*

class Question2Adapter(private val context: Context, private val choices: Array<String>) :
    RecyclerView.Adapter<Question2Adapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(
                parent.context
            ).inflate(R.layout.question_2_item, parent, false)
        )
    }

    override fun getItemCount(): Int {
        Log.e("CHOICES", choices.size.toString())
        return choices.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.choice_text.text = choices[position]

        holder.itemView.cardview.setOnClickListener {

            (context as AppCompatActivity).supportFragmentManager.beginTransaction()
                .replace(R.id.layout_container, MeasurementsFragment())
                .addToBackStack(null)
                .commit()
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}