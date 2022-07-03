package com.zakaria.kotlinplayground.InheritanceKotlin
import kotlin.math.PI
import kotlin.math.abs

//Classes and inheritance in Kotlin ===================
//codelabs google======================================

fun main() {

    val squareCabin = SquareCabin(6,50.0)
    val roundHut = RoundHut(3, 10.0);
    val roundTower = RoundTower(4, 15.5)

    with(squareCabin) {
        println("\nSquare Cabin\n====================")
        println("Capacity: ${squareCabin.capacity}")
        println("Material: ${squareCabin.buildingMeterial}")
        println("Has room: ${squareCabin.hasRomm()}")
        println("Floor area:%.2f".format(floorArea()))

    }

    with(roundHut){
        println("\nRound Hut\n====================")
        println("Capacity: ${roundHut.capacity}")
        println("Material: ${roundHut.buildingMeterial}")
        println("Has room: ${roundHut.hasRomm()}")
        println("Floor area:%.2f".format(floorArea()))

        println("Has room? ${roundHut.hasRomm()}")
        getRoom()
        println("Has room? ${roundHut.hasRomm()}")
        getRoom()

    }

    with(roundTower){
        println("\nRound Tower\n====================")
        println("Capacity: ${roundTower.capacity}")
        println("Material: ${roundTower.buildingMeterial}")
        println("Has room: ${roundTower.hasRomm()}")
        println("Floor area:%.2f".format(floorArea()))
    }

}


