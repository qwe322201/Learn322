package com.tom.box

import com.box.Box3
import com.box.Box5
import java.util.*

fun main() {
    var box3= Box3(23f,24f,13)
    var box5= Box5(39.5f,27.5f,13)
    val scanner=Scanner(System.`in`)
    println(" Please enter object's length:");
    val length=scanner.nextFloat();
    println(" Please enter object's width:");
    val width=scanner.nextFloat();
    println(" Please enter object's height:");
    val height=scanner.nextInt();
 if(box3.validate(length,width,height)) {
     println("put Box3")
 } else if (box5.validate(length,width,height)){
     println("put Box5")
 }
    else {
        println("no Box")
    }
}
class Box3(lenght:Float,width:Float,height:Int){
     fun validate(length:Float, width:Float, height:Int) : Boolean =
        (length >= length && width >= width && height >= height)
}
class Box5(lenght: Float,width: Float,height: Int){
     fun validate(length:Float, width:Float, height:Int): Boolean =
        (length >= length && width >= width && height >= height)
}
open class  Box(var lenght:Float,var width:Float,var height:Int){
   fun validate(lenght: Float,width: Float,height: Int):Boolean=true
}