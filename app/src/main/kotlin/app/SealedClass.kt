package app

import data.Min
import data.Modulo
import data.Operation
import data.Plus

fun operation(value1:Int, value2:Int, operation : Operation) : Int {
    return when(operation) {
        is Plus -> value1 + value2
        is Min -> value1 - value2
        is Modulo -> value1 % value2
    }
}

fun main() {
    println(operation(10,10,Plus()))
    println(operation(10,10,Min()))
    println(operation(10,10,Modulo()))
}