fun main() {

    val name = "Nanda"
    val hello = name.hello()

    println(hello)
}

fun String.hello() = "Hello $this"
