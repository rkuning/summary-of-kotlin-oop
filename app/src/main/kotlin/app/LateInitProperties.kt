package app

import data.Television

fun main() {
    val tv = Television()
//    println(tv.brand) //error, karena belum di inisialiassi variabel brandnhya

    tv.initTelevision("Sony")
    println(tv.brand)

}