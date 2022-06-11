package com.zakaria.kotlinplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Write conditionals in Kotlin - Google Codelab
        // Use if/else statements to express conditions

        fun main() {
            val number = 1;
            println(number == number) //< > <= >= !=

            val trafficLightColor = "Yellow"

            if (trafficLightColor == "Red") {
                println("Stop")
            } else if (trafficLightColor == "Yellow") {
                println("Slow")
            } else if (trafficLightColor == "Green") {
                println("Go")
            } else {
                println("Invalid Traffic Color");
            }
        }


        //when statement
        val trafficLightColor = "Yellow"
        when (trafficLightColor) {
            "Red" -> println("Stop")
            "Yellow" -> println("Slow")
            "Greem" -> println("Go")
            else -> println("Invalid traffic-light")
        }


        //when Keyword - when()
        val x = 3
        when (x) {
            2 -> println("x is prime number between 1 and 10")
            3 -> println("x is prime numbet between 1 and 103")
            else -> println("x is't a prime number between 1 and 10")
        }

        when (x) {
            2, 3, 5, 7 -> println("x is prime number beetween 1 and 10")
            2 -> println("x is prime number between 1 and 10")
            3 -> println("x is prime number between 1 and 103")
            else -> println("x is't a prime number between 1 and 10")
        }

        when (x) {
            2, 3, 5, 7 -> println("x is prime number between 1 to 10")
            in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
            else -> println("x isn't prime number")
        }


        //is keyword - is type chek
        //val x: Any = 20
        when (x) {
            2, 3, 5, 7 -> println("x is prime number between 1 to 10")
            in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
            is Int -> println("x is an integer, but not between 1 and 10")
            else -> println("x isn't prime number")
        }


        //if statement to an expression
        //val trafficLightColor = "Green"
        val message = when(trafficLightColor){
            "Red" -> "Stop"
            "Yellow", "Amber" -> "Proceed with Cautipon"
            "Green" -> "Go"
            else -> "Invalid Color "
        }
        println(message)
        //output - Go

    }
}