package app

import data.Car

fun main() {
    val toyota = Car("Toyota","Avanza", 2024)
    toyota.brand = "Mazda"
    println(toyota.brand)
    println(toyota.year)
    val mitsu = Car("Mitsubishi")
    mitsu.brand = "Aventador"
    println(mitsu.brand)
    println(mitsu.year)
}