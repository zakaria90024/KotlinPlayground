package com.zakaria.kotlinplayground.InheritanceKotlin

import java.lang.Math.PI

class RoundTower(residents: Int,radius: Double, val floors: Int = 2) : RoundHut(residents, radius) {

    override val buildingMeterial: String
        get() = "Stone"
    override val capacity: Int
        get() = 4

    override fun floorArea(): Double {
        return super.floorArea() * floors
    }


}