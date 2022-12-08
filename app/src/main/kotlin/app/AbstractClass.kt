package app

import data.City
import data.Country
import data.Location

fun main() {
//    val location = Location("disana") // error
    val city = City("boyolali")
    val country = Country("Indonesia")

    println(city.name)
    println(country.name)
}