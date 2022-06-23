package app

import data.Location

fun main() {

//    val location1 = Location("Indonesia") // ini akan error karena abstract class tidak bisa dibuat instance object
    val city1 = City("Jakarta")
    println(city1.name)
}

// abstract class bisa diturunkan
class City(name: String) : Location(name)