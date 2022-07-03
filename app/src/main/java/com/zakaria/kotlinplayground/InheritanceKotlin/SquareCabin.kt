package com.zakaria.kotlinplayground.InheritanceKotlin

class SquareCabin(residents: Int, val length: Double) :Dwelling(residents) {
    override fun floorArea(): Double {
        return length * length
    }

    override val buildingMeterial: String
        get() = "Wood"
    override val capacity: Int
        get() = 6
}