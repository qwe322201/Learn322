package com.tom.box

import com.box.Box3
import com.box.Box5
import java.util.*

fun main() {
    var length: Float
    var width: Float
    var height: Int
    val box3 = Box3(23f, 14f, 13)
    val box5 = Box5(39.5f, 27.5f, 23)
    val scanner = Scanner(System.`in`)
    println(" Please enter object's length:");
    length = scanner.nextFloat();
    println(" Please enter object's width:");
    width = scanner.nextFloat();
    println(" Please enter object's height:");
    height = scanner.nextInt();
    if (box3.validate(length, width, height)) {
        println("put Box3")
    } else if (box5.validate(length, width, height)) {
        println("put Box5")
    }else{
        println("no put")
    }
}
class Box5(inLength: Float,inWidth:Float,inHeight:Int):Box(inLength,inWidth,inHeight){}
class Box3(inLength: Float,inWidth:Float,inHeight:Int):Box(inLength,inWidth,inHeight){}

open class Box(val inLength: Float,val inWidth:Float,val inHeight:Int){
    open fun validate(length : Float, width : Float, height : Int)
            =(inLength>=length && inWidth >=width && inHeight >= height)
}