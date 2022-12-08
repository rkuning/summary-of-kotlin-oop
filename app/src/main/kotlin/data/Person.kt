package data

//properties di constructor (var firstName : String = "", var middleName : String? = null, var lastname : String = "")
class Person(var firstName : String = "", var middleName : String? = null, var lastname : String = "") {

    fun sayHello(name: String) {
        println("Hello $name, my name is $firstName...")
    }

//    function overloading, namanya sama tapi parameternya berbeda
    fun sayHello(pFirstName: String, pLastName: String) {
        println("Hello $pFirstName $pLastName, my name is $firstName...")
    }

//    this keyword : memanggil parameter parrent karena nama parameter sama
    fun sayHello(firstName: String, pMiddleName : String, pLastName : String) {
        println("Hello $firstName $pMiddleName $pLastName, my name is ${this.firstName}...")
    }

    fun run () {
        println("im Run")
    }

    fun getFullName() : String {
        return "$firstName $middleName $lastname"
    }
}