package app

import data.Employee

fun main() {

    class Manager(name: String) : Employee(name)
    val manager1 = Manager("Nanda")
    manager1.sayHelloeEmployee("Manager")

    class President(name: String) : Employee(name)
    val president1 = President("Nanda")
    president1.sayHelloeEmployee("Presiden")

    val karyawan1 = Karyawan("Nanda Iqbal Hanafi")
    karyawan1.helloUntukOverride("Bruno")
}

final class Karyawan(name: String) : Employee(name){

    override fun helloUntukOverride(name: String) {
        println("Hello ${name}, my name is ${this.name}. Ini dari overriding function")
    }
}