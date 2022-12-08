package app

import data.Rectangle
import data.Shape
import data.Triangle

fun main() {
    val shape = Shape()
    println(shape.corner)

    val triangle = Triangle()
    println(triangle.corner)

    val recta = Rectangle()
    println(recta.corner)
}