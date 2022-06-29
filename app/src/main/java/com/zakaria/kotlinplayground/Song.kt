package com.zakaria.kotlinplayground

class Song(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    val playCount: Int
) {
    val isPopular: Boolean
    get() = playCount >= 1000
    fun printDescription() {
        println("$title, performed by $$artist, was released is $yearPublished")
    }
}