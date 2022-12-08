package data

open class Custommer(val name : String, val type: String, val balance : Long) {
    constructor(name : String, type: String) : this(name, type, 0)
    constructor(name : String) : this(name, "standard")
}

class PremiumCustommer : Custommer {
    constructor(name:String) : super(name, "premium")
    constructor(name:String, balance : Long) : super(name, "Premium",balance)
}

class ExecutiveCustomer(name:String, balance:Long) : Custommer(name, "executive", balance) {
    constructor(name : String) : this(name, 0)

}