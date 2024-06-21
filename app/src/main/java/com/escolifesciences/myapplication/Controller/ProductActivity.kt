package com.escolifesciences.myapplication.Controller

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.escolifesciences.myapplication.Adapters.ProductAdapter
import com.escolifesciences.myapplication.R
import com.escolifesciences.myapplication.Services.DataService

class ProductActivity : AppCompatActivity() {

    lateinit var rvProductAdapter : ProductAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_product)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val rvProduct = findViewById<RecyclerView>(R.id.rvProducts)
        val category = intent.getStringExtra("category")
        rvProductAdapter = ProductAdapter(this, DataService.getProducts(category!!))

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            spanCount = 3
        }

        val screenSize = resources.configuration.screenWidthDp
        if (screenSize > 720) {
            spanCount = 3
        }


        val layoutManager = GridLayoutManager(this, spanCount)
        rvProduct.layoutManager = layoutManager
        rvProduct.adapter = rvProductAdapter



    }
}