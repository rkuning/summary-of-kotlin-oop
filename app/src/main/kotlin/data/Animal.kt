package data

abstract class Animal {
//    bentuk abstract tidak boleh di deklarasikan langsung
    abstract val name : String
//    function abstract tidak boleh memiliki body
    abstract fun run()
}

class Cat : Animal() {
    override val name: String = "cat"
    override fun run() = println("run cat")
}

class Dog : Animal() {
    override val name: String = "Dog"
    override fun run() {
        println("run dog")
    }
}