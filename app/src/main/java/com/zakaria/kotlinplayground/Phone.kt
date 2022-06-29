package com.zakaria.kotlinplayground

open class Phone (var isScreenLightOn: Boolean = false){
    open fun switchOn(){
        isScreenLightOn = true;
    }
    fun switchOff(){
        isScreenLightOn = false
    }
    fun  checkPhoneScreenLight(){
        val phoneScreenLight  = if(isScreenLightOn) "on" else "off"
        println("The people screen's os $phoneScreenLight.")
    }
}