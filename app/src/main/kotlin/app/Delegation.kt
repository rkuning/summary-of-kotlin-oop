package app

import data.Delegation
import data.MyBase
import data.MyBaseDelegate

fun main() {
    val base = MyBase()
    base.sayHello("Wahyu")

    val baseDelegate = MyBaseDelegate(base)
    baseDelegate.sayHello("joko")
    baseDelegate.sayGoodbye("toni")


    val delegate = Delegation(base)
    delegate.sayHello("mainton")
    delegate.sayGoodbye("askdfkashdkfl")

}