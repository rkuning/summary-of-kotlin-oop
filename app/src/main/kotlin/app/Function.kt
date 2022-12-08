package app

import data.Person

fun main() {
    val eko = Person("Danang","Ipul","Basrin")

    eko.sayHello("Wahtu")
    val fullName = eko.getFullName()
    println(fullName)
    eko.run()
}