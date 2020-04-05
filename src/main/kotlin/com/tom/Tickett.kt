package com.tom

import java.util.*


data class Tickett(val origin:Int,val destination:Int,val price:Int)

fun main() {
    var tickett=Tickett(20,51,420)
    val s="abcde"
    println(s.valdate())
    println((1..10).random())
    val r=Random().nextInt(10)+1
}
fun String.valdate() :Boolean{
    return this.length >=6
}
fun IntRange.random():Int{
    val r= Random().nextInt(endInclusive-start)+start
    return r
}