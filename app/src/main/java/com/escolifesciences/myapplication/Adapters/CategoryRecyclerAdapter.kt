package com.escolifesciences.myapplication.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ListAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.escolifesciences.myapplication.Model.Category
import com.escolifesciences.myapplication.R

class CategoryRecyclerAdapter(
    val context: Context,
    val categories: List<Category>
) : RecyclerView.Adapter<CategoryRecyclerAdapter.Holder>() {
    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgCategory = itemView.findViewById<ImageView>(R.id.imgCategory)
        val txtCategory = itemView.findViewById<TextView>(R.id.txtCategory)

        fun bind(category: Category, context: Context ) {
            val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)

            imgCategory.setImageResource(resourceId)
            txtCategory.text = category.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_categories, parent, false)

        return Holder(view)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(categories[position], context)
    }
}
