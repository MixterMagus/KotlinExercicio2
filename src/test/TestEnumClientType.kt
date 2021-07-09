package test

import Program.ClientType

fun main(){
    ClientType.values().forEach {
        println("$it - ${it.description}")
    }

    var clientOne = ClientType.PF
    println("${clientOne.description} ${clientOne.changeable}")
    clientOne.changeable="lulu"
    println("${clientOne.description} ${clientOne.changeable}")

}