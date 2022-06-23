package app

import data.Animal

fun main() {

    val cat1 = Cat()
    cat1.run()
}

class Cat : Animal(){

    // harus override semua properties yang abstract
    override val name: String = "Joni"
    override fun run() {
        println("$name running")
    }

}