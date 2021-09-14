package ru.itmo.versionsofandroid.data

import ru.itmo.versionsofandroid.R

object DataStorage {
    fun getVersionList(): List<Android> {
        return listOf(
            Android(
                "Cupcake",
                R.drawable.cupcake
            ),

            Android(
                "Donut",
                R.drawable.donut
            ),

            Android(
                "Eclair",
                R.drawable.eclair
            ),

            Android(
                "Froyo",
                R.drawable.froyo
            ),

            Android(
                "Gingerbread",
                R.drawable.gingerbread
            ),

            Android(
                "Honeycomb",
                R.drawable.honeycomb
            ),

            Android(
                "Ice Cream Sandwich",
                R.drawable.icecream
            ),

            Android(
                "Jelly Bean",
                R.drawable.jellybean
            ),

            Android(
                "KitKat",
                R.drawable.kitkat
            ),

            Android(
                "Lollipop",
                R.drawable.lollipop
            ),

            Android(
                "Marshmallow",
                R.drawable.marshmallow
            ),

            Android(
                "Nougat",
                R.drawable.nougat
            ),

            Android(
                "Oreo",
                R.drawable.oreo
            ),

            Android(
                "Eclair",
                R.drawable.eclair
            ),

            Android(
                "Pie",
                R.drawable.pie
            ),


            Android(
                "Android 10",
                R.drawable.android_ten
            ),

            Android(
                "Android 11",
                R.drawable.android_el
            )

        )


    }
}