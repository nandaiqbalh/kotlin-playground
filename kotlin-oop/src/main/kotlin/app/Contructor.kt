package app

import data.Car
import data.Person
import data.User

fun main() {
    val toyota = Car("Minibus", 4)

    println(toyota.jenis)

    val person = Person("Nanda", null, "Iqbal Hanafi")
    println(person.lastName)

    // properties di constructor
    val user1 = User("nandaiqbalh", "rahasia123")

    user1.username = "nandaiqbalh123"
    user1.password = "gajadirahasia"

    println("\nUser ini adalah ${user1.username} yang punya password ${user1.password}")
}