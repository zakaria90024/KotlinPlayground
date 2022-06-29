package com.zakaria.kotlinplayground

import android.location.GnssMeasurement
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val diceTextView: TextView = findViewById(R.id.textView);
        diceTextView.text = "This is Text"
        whenClicked(diceTextView);

        val rollButton: Button = findViewById(R.id.roll_button);
        rollButton.setOnClickListener {
            //rollDice()
            //whenClicked(diceTextView);
            countUp();
        }


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
        val message = when (trafficLightColor) {
            "Red" -> "Stop"
            "Yellow", "Amber" -> "Proceed with Caution"
            "Green" -> "Go"
            else -> "Invalid Color "
        }
        println(message)
        //output - Go

        val mes = 0;


        for (i in 1..5) {
            print("sdfsff$i");
        }
        for (i in 1..2) {
            for (j in 'A'..'C') {
                println("Outer loop: $i - Inner loop: $j")
            }
        }


    }

    private fun whenClicked(diceTextView: TextView) {
        val rantInt = (1..6).random()
        diceTextView.text = rantInt.toString()

    }

    private fun rollDice() {
        Toast.makeText(this, "button_clicked", Toast.LENGTH_LONG).show()
    }

    private fun countUp() {
        val resutText: TextView = findViewById(R.id.textView)

        if (resutText.text == "Hello World") {
            resutText.text = "1"
        } else {
            var resultInt = resutText.text.toString().toInt()
            if (resultInt < 6) {
                resultInt++
                resutText.text = resultInt.toString()
            }
        }
    }


    //Practice: Kotlin Fundamentals - Codelab
    //1. Mobile notifications
    fun main1() {
        val morningNotificaton = 51
        val eveningNotification = 135

        printNotificationSummery(morningNotificaton)
        printNotificationSummery(eveningNotification)
    }

    private fun printNotificationSummery(numberOfMessage: Int) {
        if (numberOfMessage < 100) {
            println("You have $numberOfMessage notifications.")
        } else {
            println("Your phone is blowing up! You have 99+ notifications.")
        }
    }


    //3.Movie - ticket price
    fun main() {
        val child = 5
        val adult = 28
        val senior = 87
        val isMonday = true

        println(
            "The movie ticket price for a person aged $child is  \$${
                ticketPrice(
                    child,
                    isMonday
                )
            }."
        )
        println(
            "The movie ticket price for a person aged $adult is \$${
                ticketPrice(
                    adult,
                    isMonday
                )
            }."
        )
        println(
            "The movie ticket price for a person aged $senior is \$${
                ticketPrice(
                    senior,
                    isMonday
                )
            }."
        )
    }

    fun ticketPrice(age: Int, isMonday: Boolean): Int {
        return when (age) {
            in 0..12 -> 15
            in 13..60 -> if (isMonday) 25 else 30
            in 61..100 -> 20
            else -> -1
        }

    }

    //5. Temperature converter
    fun maind() {
        printFinalTemperature(27.0, "Celsius", "Fahrenheit") { 9.0 / 5.0 * it + 32 }
        printFinalTemperature(350.0, "Kelvin", "Celsius") { it - 273.15 }
        printFinalTemperature(10.0, "Fahrenheit", "Kelvin") { 5.0 / 9.0 * (it - 32) + 273.15 }
    }

    fun printFinalTemperature(
        initialMeasurement: Double,
        initialUnit: String,
        finalUnit: String,
        conversionFormula: (Double) -> Double
    ) {
        val finalMeasurement =
            String.format("%.2f", conversionFormula(initialMeasurement))//two decimal place
        println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit");
    }

    //5. Song catalog
    fun mainSong() {
        val brunoSong = Song("We Don't Talk About Bruno", "Encanto Cast", 2022, 1_000_000)
        brunoSong.printDescription()
        println(brunoSong.isPopular)
    }

    //6. Internet profile
    fun maingInternet(){
        val amanda = Person("Amanda", 33, "Play tennis", null)
        val atiqah = Person("Atiqah", 28 , "climb", amanda);
    }


    //7. Foldable phones
    fun mainFoldablePhone(){
       val  newFoldablePhone = FoldablePhone();
        newFoldablePhone.switchOn()
        newFoldablePhone.checkPhoneScreenLight()
        newFoldablePhone.fold()
        newFoldablePhone.unfold()
        newFoldablePhone.checkPhoneScreenLight()
    }

    //8. Special auction
    fun mainAuction() {
        val winningBid = Bid(5000, "Private Collector")

        println("Item A is sold at ${auctionPrice(winningBid, 2000)}.")
        println("Item B is sold at ${auctionPrice(null, 3000)}.")
    }
    fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
        return bid?.anmmount?: minimumPrice
    }

}