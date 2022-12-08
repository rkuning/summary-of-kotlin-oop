package data

//jika public diganti private, maka akan error, walaupun di akses oleh function didalam class itu sendiri
class Student(val name : String, public val age : Int)

fun Student?.sayHello(name:String) {
    if (this != null) {
        println("Hello $name, my name is ${this.name}, and im ${this.age} years old.")
    }
}

//extension propertis
val Student.upperName : String
get() = this.name.toUpperCase()

