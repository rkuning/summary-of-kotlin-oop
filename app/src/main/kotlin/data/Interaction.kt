package data

//pada interface, boleh memwarisi banyak parrent, beda dengan class yang hanya 1 parrent

interface Interaction {
//    variabel tidak boleh dideklarasikan
    val name : String
//    fungsi boleh terdapat body, jika body sudah di deklarasikan di interface, maka di childnya tidak wajib di override
    fun sayHello (name : String){
    println("Hello $name, my name is ${this.name}")
}
}

/*
interface boleh mewarisi interface lain, tapi tidak boleh mewarisi class
 */

interface Go : Interaction {
    fun go() {
        println("Go!")
    }
}

open class Contoh

/*
class human boleh mewarisi lebih dari 1 interface, tapi jika class hanya boleh 1
 */

interface MoveA {
    fun move () = println("Move A")
}

interface MoveB {
    fun move () = println("Move B")
}

/*
jika terdapat fungsi yang sama pada 2 interface, solusinya function wajib di override
 */

class  Human(override val name : String) : Go, Contoh(), MoveA, MoveB {
//    karena ada 2 fungsi yang sama pada interface, maka wajib di override fun dummy() {}
    override fun move() {
        println("Move Human")
//    memanggil fungsi parrent interface dengan cara berikut ini
    super<MoveA>.move()
    super<MoveB>.move()
    }
}