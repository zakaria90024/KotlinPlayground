package com.zakaria.kotlinplayground.InheritanceKotlin

abstract class Dwelling(private var residents: Int) {

    abstract val buildingMeterial: String
    abstract val capacity: Int
    abstract fun floorArea(): Double

    abstract class Dwelling(private var residents: Int)

    fun hasRomm(): Boolean {
        return residents < capacity
    }

    fun getRoom() {
        if (capacity > residents) {
            residents++
            println("You got a room!")
        } else {
            println("Sorry, at capacity and no rooms left.")
        }
    }

}