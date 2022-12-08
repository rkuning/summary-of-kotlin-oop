package app

import data.User

fun main() {
    val user1 = User("Danang","123")
    val user2 = User("Ipul","321")

    user1.password = "sangat rahasia"

    println(user1.username)
    println(user1.password)
    println(user2.username)
    println(user2.password)
}