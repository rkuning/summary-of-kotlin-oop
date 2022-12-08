package data

open class Teacher(val name : String) {

//    private hanya dapat di akses pada class dimana dia di deklarasikan
    private fun teach() {
        println("teach $name")
    }

//    protected, bisa di akses di lokal class beserta turunanya
    protected fun test() {
        println("test")
    }
}

class SuperTeacher(name:String) : Teacher(name) {
    fun okay() {
        super.test()
    }
}