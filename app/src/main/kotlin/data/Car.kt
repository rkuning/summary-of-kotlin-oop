package data

class Car(pBrand : String, pName : String, pYear : Int) {

//    initialitation block
    init {
        println("init $pBrand dibuat!")
    }

    constructor(pBrand: String, pName: String) : this(pBrand, pName, 2022) {
        println("sec constructor")
    }

    constructor(pBrand: String) : this(pBrand, "") {
        println("sec constructor 2")
    }


    var brand : String = pBrand
    var year : Int = pYear
    var name : String = pName
}