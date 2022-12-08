package app

import data.Smartphone

fun main() {
    val smart = Smartphone("samsung s10","android")
    println(smart.toString())
    println(smart.hashCode())
    println()
}