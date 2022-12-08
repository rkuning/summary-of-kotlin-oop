package app

import data.BigNote
import data.Note

fun main() {
    val note= Note("belajar kotlin")

    note.title

    note.title = ""

    note.title = "Okay"

    println(note.title)

    val bigNote = BigNote("belajar kotlinnn")
    println(bigNote.title)
    println(bigNote.bigTitle)

}