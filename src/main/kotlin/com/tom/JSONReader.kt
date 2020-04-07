package com.tom

import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

fun main() {
    val url= URL("")
    println(url.readText())
    /*val connection= url.openConnection() as HttpURLConnection
    val br =BufferedReader(InputStreamReader(connection.inputStream))
    var line=br.readLine()
    val json=StringBuffer()
    while(line != null){
       json.append(line)
        line = br.readLine()
    }
    println(json.toString())   */
}