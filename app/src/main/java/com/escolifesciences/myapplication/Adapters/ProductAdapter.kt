package com.escolifesciences.myapplication.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.escolifesciences.myapplication.Model.Product
import com.escolifesciences.myapplication.R

class ProductAdapter(val context: Context,val  products: List<Product>) : RecyclerView.Adapter<ProductAdapter.Holder>() {

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgProduct = itemView.findViewById<ImageView>(R.id.imgProdutc)
        val txtProductName = itemView.findViewById<TextView>(R.id.txtProductName)
        val txtProductPrice = itemView.findViewById<TextView>(R.id.txtProductPrice)

        fun bind(products: Product, context: Context) {
            val resourceId = context.resources.getIdentifier(products.image, "drawable", context.packageName)

            imgProduct.setImageResource(resourceId)
            txtProductName.text = products.title
            txtProductPrice.text = products.price
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_products, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
       holder.bind(products[position], context)
    }
}