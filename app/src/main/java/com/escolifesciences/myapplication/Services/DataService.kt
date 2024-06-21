package com.escolifesciences.myapplication.Services

import com.escolifesciences.myapplication.Model.Category
import com.escolifesciences.myapplication.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Golfik Graphic Beanie", "$18", "hat1"),
        Product("Golfik Black Hat", "$20", "hat2"),
        Product("Golfik White Hat", "$22", "hat3"),
        Product("Golfik Snap Hat", "$20", "hat4"),
        Product("Golfik Graphic Beanie", "$18", "hat1"),
        Product("Golfik Black Hat", "$20", "hat2"),
        Product("Golfik White Hat", "$22", "hat3"),
        Product("Golfik Snap Hat", "$20", "hat4")
    )

    val hoodies = listOf(
        Product("Golfik Grey Hoodie", "$28", "hoodie1"),
        Product("Golfik Red Hoodie", "$32", "hoodie2"),
        Product("Golfik Black Hoodie", "$30", "hoodie3"),
        Product("Golfik White Hoodie", "$30", "hoodie4"),
        Product("Golfik Grey Hoodie", "$28", "hoodie1"),
        Product("Golfik Red Hoodie", "$32", "hoodie2"),
        Product("Golfik Black Hoodie", "$30", "hoodie3"),
        Product("Golfik White Hoodie", "$30", "hoodie4")
    )

    val shirts = listOf(
        Product("Golfik Black Shirt", "$15", "shirt1"),
        Product("Golfik Light Gray Shirt", "$15", "shirt2"),
        Product("Golfik Logo Shirt", "$18", "shirt3"),
        Product("Golfik Hustle Shirt", "$18", "shirt4"),
        Product("Kickflip Studios", "$18", "shirt5"),
        Product("Golfik Black Shirt", "$15", "shirt1"),
        Product("Golfik Light Gray Shirt", "$15", "shirt2"),
        Product("Golfik Logo Shirt", "$18", "shirt3"),
        Product("Golfik Hustle Shirt", "$18", "shirt4"),
        Product("Kickflip Studios", "$18", "shirt5")
    )

    val digitalGoods = listOf<Product>()

    fun getProducts(category: String) : List<Product> {
        when (category) {
            "SHIRTS" -> return shirts
            "HATS" -> return hats
            "HOODIES" -> return hoodies
            else -> return digitalGoods
        }
    }

}