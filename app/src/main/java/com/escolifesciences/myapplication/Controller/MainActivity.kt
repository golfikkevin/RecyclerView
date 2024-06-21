package com.escolifesciences.myapplication.Controller

import android.os.Bundle
import android.provider.ContactsContract.Data
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.escolifesciences.myapplication.Adapters.CategoryRecyclerAdapter
import com.escolifesciences.myapplication.Adapters.MainAdapter
import com.escolifesciences.myapplication.R
import com.escolifesciences.myapplication.Services.DataService

class MainActivity : AppCompatActivity() {

    lateinit var rvAdapter: CategoryRecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val rvCategories = findViewById<RecyclerView>(R.id.rvCategories)

//        lvAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, DataService.categories)
        rvAdapter = CategoryRecyclerAdapter(this, DataService.categories)

        rvCategories.adapter = rvAdapter

        val layoutManager = LinearLayoutManager(this)
        rvCategories.layoutManager = layoutManager
        rvCategories.setHasFixedSize(true)

    }
}