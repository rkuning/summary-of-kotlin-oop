package data

//cara simple destructuring adalah memakai class data
//sehingga tidak perlu mendeklarasikan componen properti yang ada pada class tersebut
data class Game(val name : String, val price : Int) {
}

//jika pakai class biasa, maka harus di deklarasikan componentnya
class Game1(val name: String, val price: Int){
    operator fun component1() : String = name
    operator fun component2() : Int = price
}
