package app

import data.Token

//inline : berfungsi untuk mendeklarasikan kelas sebagai 1 variabel saja, bukan class asli
fun main() {
    val token = Token("ini token")
    println(token.value)
    println(token.toUpper())
}