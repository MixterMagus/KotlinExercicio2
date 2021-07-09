package test

import Program.ClientType

fun main(){
    ClientType.values().forEach {
        println("$it - ${it.description}")
    }

    val clientOne = ClientType.PF
    println("${clientOne.description}")
}