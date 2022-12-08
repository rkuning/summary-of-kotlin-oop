package app

import data.Game
import data.Game1
import data.Login
import data.MinMax

fun minMax(value1:Int, value2:Int) : MinMax{
    return when {
        value1 > value2 -> MinMax(value2, value1)
        else -> MinMax(value1, value2)
    }
}

fun login(login : Login, callback : (Login) -> Boolean) : Boolean {
    return callback(login)
}

fun main() {
//    data class
    var game = Game("tony hawk", 20000)
    var (name, price) = game
    println(name)
    println(price)

//    class biasa
//    var game1 = Game1("asdf hawk", 15000)
//    var (name, price) = game1
//    println(name)
//    println(price)

//    cara sebelum destructuring function
//    val result = minMax(10,100)
//    val min = result.min
//    val max = result.max

//    cara sesudah destructuring function
    val (min, max) = minMax(300, 250)
    println(min)
    println(max)

//    jika hanya ingin mengambil salah satu variabel saja, maka diganti dengan _ (underscore)

    val login = Login("danang","123")
//    login(login){login ->
//        login.user == "danang" && login.pass == "12"
//    }
    login(login){(user, pass) ->
        user == "danang" && pass == "123"
    }
}