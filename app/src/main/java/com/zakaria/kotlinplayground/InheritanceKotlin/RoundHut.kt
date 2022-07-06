package com.zakaria.kotlinplayground.InheritanceKotlin

import java.lang.Math.PI
import java.lang.Math.sqrt

open class RoundHut(residents: Int, private val radius: Double) : Dwelling(residents) {
    override val capacity: Int
        get() = 4
    override val buildingMeterial: String
        get() = "Straw"

    override fun floorArea(): Double {
        return PI * radius * radius
    }

    fun calculateMaxCarpetLength(): Double {
        return kotlin.math.sqrt(2.0) * radius
    }
}