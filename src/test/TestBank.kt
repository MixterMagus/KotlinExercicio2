package test

import Program.Bank

fun main(){
    val digiOneBank = Bank("SaloBank",12)
    println(digiOneBank.getInfo())
    val digitalTwoBank = digiOneBank.copy(name = "Jacibank")
    println(digitalTwoBank.getInfo())
}