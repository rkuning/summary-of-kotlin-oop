package app

import data.Fruit

fun main() {
    val f1 = Fruit(10)
    val f2 = Fruit(20)
    val f3 = f1 + f2
    val f4 = f1 - f2
    println(f3)
    println(f4)
}