package app

import data.Student
import data.sayHello
import data.upperName

fun main() {
    val student : Student? = Student("Danang", 17)
    student.sayHello("dwi")

    println(student?.upperName)
}