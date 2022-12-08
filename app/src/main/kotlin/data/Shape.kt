package data

open class Shape {
//    properties overloading, wajib pakai open di awal deklarasi, agar bisa di override
    open val corner : Int = -1

    open fun printName () {
        println("this is shape")
    }
}

class Rectangle : Shape() {
    override val corner : Int = 4
//    super keyword : memanggil nilai parent
    val parrentCorner : Int = super.corner
    override fun printName() {
        println("this is rectangle")
        super.printName()
    }
}

class Triangle : Shape() {
    override val corner : Int = 8
}