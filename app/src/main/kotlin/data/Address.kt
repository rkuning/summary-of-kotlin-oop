package data

class Address {

    //    tanpa deklarasi primary constructor
    var street: String = ""
    var city: String = ""
    var country: String = "Indonesia"

    constructor(pStreet : String, pCity:String) {
        street = pStreet
        city = pCity
    }
    constructor(pStreet : String, pCity:String, pCountry:String) : this(pStreet, pCity) {
        country = pCountry
    }

}