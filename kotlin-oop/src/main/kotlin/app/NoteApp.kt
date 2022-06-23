package app

import data.Note

fun main() {

    val note1 = Note("Mandi")

    // memanggil getter
    println(note1.title)

    note1.title = ""

    note1.title = "Belajar Kotlin"
    println(note1.title)

}