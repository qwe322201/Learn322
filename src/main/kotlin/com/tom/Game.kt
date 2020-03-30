package com.tom

import java.util.*

fun main() {
    val secret = Random().nextInt(10) + 1
    println(secret)
    val scanner = Scanner(System.`in`)
    var number = 0
    while (number != secret){
        print("Plaese emter number")
   // number = scanner.nextInt()
        number= readLine()!!.toInt()
    if (number > secret) {
        println("lower")
    } else if (number < secret) {
        println("high")
    } else {
        println("great number is $number")
    }
}
}
