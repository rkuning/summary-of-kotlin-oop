package data

open class Employee(val name:String) {
//    kata open dibawah berfungsi agar function sayHello dapat di override childnya
    open fun sayHello (name : String) {
        println("hello $name my name is ${this.name}")
    }
}

//inheritance, pewarisan. manager mewarisi employee
class Manager (name : String): Employee(name){
//    function overriding : mendeklarasikan ulang fungsi parent yang udah ada
    final override fun sayHello(name : String){
        println("Hello $name, my manager name is ${this.name}")
    }
}

class VicePresident(name : String) : Employee(name) {
//    kata final dibawah agar child dari viceprecidnet tidak bisa mengoverride fungsi sayHellow
    final override fun sayHello(name : String){
        println("Hello $name, my vice president name is ${this.name}")
    }
}