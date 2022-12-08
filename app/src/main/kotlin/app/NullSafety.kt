package app

data class Friend(val name : String)

fun sayHello(friend: Friend?){
//    cara 1
    if (friend != null) {
    println("Hello ${friend.name}")
    }

//    cara 2
    println("Hello ${friend?.name}")

//    cara 3 / elfis presley wawokawo
//    mengisi default value jika nilai berupa null
    val name = friend?.name ?: "danang"
    println("Hello $name")

//    memaksa nilai nullable jadi tidak null (hati hati penggunannya)
    val nama = friend!!.name // jika nilai yang di input adalah null, maka terjadi null pointer exception
    println("Hello $name")
}



fun main() {
    sayHello(Friend("Friend"))
    sayHello(null)
}