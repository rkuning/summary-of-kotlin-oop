package app

import data.Action

fun fireAction(action: Action) {
    action.action()
}

class sampleAction : Action{
    override fun action() {
        println("this is asmple action")
    }
}

fun main() {
    fireAction(sampleAction())

//    anonymous class

    fireAction(object : Action{
        override fun action() {
            println("action 1")
        }
    })

    fireAction(object : Action{
        override fun action() = println("action 2")
    })
}