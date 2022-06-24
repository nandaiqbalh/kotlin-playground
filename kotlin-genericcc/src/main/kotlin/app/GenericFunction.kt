package app

import data.Function

fun main() {

    val function1 = Function("Nanda")

    function1.sayHello<String>("Bruno")
    function1.sayHello("Bruno")

    function1.sayHello<Int>(10)
    function1.sayHello(10)
}