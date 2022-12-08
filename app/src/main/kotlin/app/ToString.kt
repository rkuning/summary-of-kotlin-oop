package app

import data.User

fun main() {
    val user = User("Danang","123")
//    tidak perlu menuliskan secara explicit user.toString(), cukup user saja
    println(user)
}