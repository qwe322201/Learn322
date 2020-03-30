package com.tom.train

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var Ticket = 0
    var round = 0
    while (true) {
        println("Please enter number of tickets : ")
        Ticket = scanner.nextInt()
        if (Ticket == -1) break
        println("How many rounf-trip tickets : ")
        round = scanner.nextInt()
        if (round == -1) break
        Ticket(Ticket, round).tst()

    }

}
class Ticket(val Ticket: Int, val round: Int) {
    companion object {
        val oneWayPrice = 1000
        val roundTripPrice = 2000
        val discount = 0.92
    }

    val oneWayTotal = (Ticket - round) * oneWayPrice
    val roundtripTotal = round * roundTripPrice * discount
    val total = (oneWayTotal + roundtripTotal).toInt()

    fun tst() = println(
        "Total tickets : ${Ticket}\n" +
                "Round-trip : ${round}\n" +
                "Total : ${total}"
    )

}