package app

import data.Product

fun main() {
    val product = Product("Indomie", 2000, "Mie")
    val product2 = product.copy("Sarimi",300)

    println(product)
    println(product2)
}