package app

import data.Gender

fun main() {
    val man = Gender.Male
    val woman = Gender.Female

    val allGender : Array<Gender> = Gender.values()

    val manFromString = Gender.valueOf("Male")
    val womanFromString = Gender.valueOf("Female")

    println(man)
    println(woman)
    println(allGender.toList())
    println(manFromString)
    println(womanFromString)

    man.showDesc()
    woman.showDesc()

}