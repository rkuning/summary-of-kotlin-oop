package app

import data.Address

fun main() {
    val address = Address("Jalan A","Jakarta")
    val address2 = Address("Jalan A","Jakarta", "Malaysia")

    println(address.country)
    println(address2.country)
}