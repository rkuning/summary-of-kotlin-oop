package app

import data.Handphone
import data.Laptop
import data.Smartphone

fun printObject (any : Any) {
//    pakai if
    if (any is Laptop) {
    println("Laptop ${any.name}")
    } else if (any is Handphone) {
    println("Handphone ${any.name}")
    } else {
        println(any)
    }

//    pakai when
    when(any) {
        is Laptop -> println("Laptop when ${any.name}")
        is Handphone -> println("Handphone when ${any.name}")
        else -> println(any)
    }
}

fun printString (any : Any) {
    val value = any as String;
    println(value)
}

// solusi dari cast exception adalah dibawah ini, akan tetapi jika konversi gagal maka hasinlya null
fun printString2 (any : Any) {
    val value : String? = any as? String;
    println(value)
}

fun main() {
    printObject("danang")
    printObject(10)
    printObject(true)
    printObject(10.4)
    printObject(Laptop("Acer"))
    printObject(Handphone("Asus"))

    printString("Danang")
//    printString(10) // error class cast exception

    printString2("Danang")
    printString2(10) // hasilnya null
}