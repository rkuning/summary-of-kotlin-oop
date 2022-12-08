package app

import data.Manager
import data.VicePresident

fun main() {
    val manager = Manager("danang")
    manager.sayHello("budy")

    val vice = VicePresident("danangn")
    vice.sayHello("wanto")
}