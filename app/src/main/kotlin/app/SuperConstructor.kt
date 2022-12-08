package app

import data.ExecutiveCustomer
import data.PremiumCustommer

fun main() {
    val premium = PremiumCustommer("danang")
    println(premium.name)

    val exe = ExecutiveCustomer("dnang",200)
    println(exe.name)
    println(exe.balance)
}