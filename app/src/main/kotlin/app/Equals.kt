package app

import data.Company

fun main() {
    val comp1 = Company("CODEID")
    val comp2 = Company("CODEID")
    println(comp1 == comp2) //false
    println(comp1 == comp1) //true
    println(comp2 == comp2) //true

//hash code

}