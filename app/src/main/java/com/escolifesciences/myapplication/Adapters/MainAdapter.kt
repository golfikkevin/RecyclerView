package com.escolifesciences.myapplication.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.escolifesciences.myapplication.Model.Category
import com.escolifesciences.myapplication.R

class MainAdapter(context: Context, categories: List<Category>) : BaseAdapter() {

    val context = context
    val categories = categories
    override fun getCount(): Int {
        return categories.count()
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View
        val holder : ViewHolder

        if (convertView == null) {
            categoryView = LayoutInflater.from(context).inflate(R.layout.item_categories, null)
            holder = ViewHolder()
            holder.imgCategory = categoryView.findViewById(R.id.imgCategory)
            holder.txtCategory = categoryView.findViewById(R.id.txtCategory)

            categoryView.tag = holder
        } else {
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }


        val category = categories[position]
        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)

        holder.txtCategory?.text = category.title
        holder.imgCategory?.setImageResource(resourceId)

        return categoryView
    }

    private class ViewHolder {
        var imgCategory: ImageView? = null
        var txtCategory: TextView? = null
    }
}