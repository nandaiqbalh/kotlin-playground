package app

import data.Employee

fun main() {

    class Manager(name: String) : Employee(name)
    val manager1 = Manager("Nanda")
    manager1.sayHelloeEmployee("Manager")

    class President(name: String) : Employee(name)
    val president1 = President("Nanda")
    president1.sayHelloeEmployee("Presiden")

}