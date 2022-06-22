package app

import data.Car
import data.Person

fun main() {
    val toyota = Car("Minibus", 4)

    println(toyota.jenis)

    val person = Person("Nanda", null, "Iqbal Hanafi")
    println(person.lastName)
}