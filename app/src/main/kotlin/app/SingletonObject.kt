package app

import data.Application
import data.Utilities

fun main() {
    println(Utilities.name)
    Utilities.name = "Berubah"
    println(Utilities.toUpper("Danang"))
    a()
    b()

    println(Application.Utilities.toUpper("Wahto"))
}

fun a() {
    println(Utilities.name)
}

fun b() {
    println(Utilities.name)
}