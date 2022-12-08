package app

import data.Application

fun main() {
    println(Application.toLower("Tono"))
//    sama aja
    println(Application.Companion.toLower("Tono"))
}