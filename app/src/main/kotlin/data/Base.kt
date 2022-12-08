package data

//cara manual delegasinya seperti kemarin itu, ketika menjadikan interface menjadi parent, maka wajib di
//deklarasikan properties dan function yang ada pada interfaec tersebut
interface Base {
    fun sayHello(name : String)
    fun sayGoodbye(name : String)
}

class MyBase : Base {
    override fun sayHello(name: String) {
        println("Hello $name")
    }

    override fun sayGoodbye(name: String) {
        println("Bye $name")
    }
}

//manual delegation

class MyBaseDelegate(val base : Base) : Base{
    override fun sayHello(name: String) {
        base.sayHello(name)
    }

    override fun sayGoodbye(name: String) {
        base.sayGoodbye(name)
    }
}

//automatis delegasi menggunakan key by
//kode dibawah artinya, semua interface Base didelegasikan ke variabel base
class Delegation(val base : Base) : Base by base