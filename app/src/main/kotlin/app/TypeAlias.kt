package app

import data.Application

typealias App  = Application
typealias Aplikasi = App
typealias App2 = data.Application

fun main() {
    val app = App("Wokay")
    val aplikasi = Aplikasi("OK")
    val app2 = App2("nghokey")

    sayHello { "Thoni" }
    sayHello2 { "Yuda" }
}

//cara sebelumnya
fun sayHello(suplier : () -> String) {
    println("Hello ${suplier()}")
}

//cara typealias
typealias StringSupplier = () -> String

fun sayHello2(supplier : StringSupplier) {
    println("Hello ${supplier()}")
}