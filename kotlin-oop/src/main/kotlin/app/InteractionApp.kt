package app

import data.Human

fun main() {

    val human1 = Human("Nanda Iqbal Hanafi")
    human1.sayHello("Bruno Fernandes")

    human1.katakanHello("Luke Shaw")

    // multiple inheritance
    human1.go()
}