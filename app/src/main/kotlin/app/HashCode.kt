package app


import data.Company

fun main() {
    val comp1 = Company("CODEID")
    val comp2 = Company("CODEID")

//    hashcode bawaan dari class Any sebelum di modivikasi seperti dibawah hasilnya
    println(comp1.hashCode())
    println(comp2.hashCode())
    println(comp1.hashCode() == comp2.hashCode()) //false
    println(comp1.hashCode() == comp1.hashCode()) //true
    println(comp2.hashCode() == comp2.hashCode()) //true

//    hashcode setelah di override
    println(comp1.hashCode() == comp2.hashCode()) //true
}