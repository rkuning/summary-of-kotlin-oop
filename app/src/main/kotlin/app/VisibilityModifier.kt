package app

import data.Teacher

fun main() {
    val teach = Teacher("danang")
//    teach.teach() // private function, hanya dapat dipanggil / dijalankan di lokal class
}

//public, berarti bisa di akses dimanapun / darimanapun
//internal, hanya dapat di akses pada 1 project tersebut
//private, hanya dapat di akses pada file / class dimana dia di deklarasikan
//protected, hanya dapat diakses turuannya saja

//secara default -> public