package app

import data.Person

fun main() {
    val eko = Person("danang","ipul","basrin")
    val joko = Person("danang", null,"anjay")
    val budi = Person("wahyu","budi","hasnduk")

    println(eko.firstName)
    println(joko.lastname)
    println(budi.firstName)
}