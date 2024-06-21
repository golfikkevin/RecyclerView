package com.escolifesciences.myapplication.Services

import com.escolifesciences.myapplication.Model.Category
import com.escolifesciences.myapplication.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
    )

    val hats = listOf(
        Product("Golfik Graphic Beanie", "$18", "hat01"),
        Product("Golfik Black Hat", "$20", "hat02"),
        Product("Golfik White Hat", "$22", "hat03"),
        Product("Golfik Snap Hat", "$20", "hat04")
    )

    val hoodies = listOf(
        Product("Golfik Grey Hoodie", "$28", "hoodie01"),
        Product("Golfik Red Hoodie", "$32", "hoodie02"),
        Product("Golfik Black Hoodie", "$30", "hoodie03"),
        Product("Golfik White Hoodie", "$30", "hoodie04")
    )

    val shirts = listOf(
        Product("Golfik Black Shirt", "$15", "shirt01"),
        Product("Golfik Light Gray Shirt", "$15", "shirt02"),
        Product("Golfik Logo Shirt", "$18", "shirt03"),
        Product("Golfik Hustle Shirt", "$18", "shirt04"),
        Product("Kickflip Studios", "$18", "shirt05")
    )

}