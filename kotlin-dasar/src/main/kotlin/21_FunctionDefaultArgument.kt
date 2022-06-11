fun main() {
    sayHello("Nanda")
    sayHello("Bruno Fernandes")
}

fun sayHello(firsName: String, lastName:String = ""){

    println("Halo $firsName $lastName")
}