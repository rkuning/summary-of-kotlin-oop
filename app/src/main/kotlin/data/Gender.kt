package data

enum class Gender(val desc : String) {
    Male("L"),
    Female("P");

    fun showDesc() {
        println(desc)
    }
}