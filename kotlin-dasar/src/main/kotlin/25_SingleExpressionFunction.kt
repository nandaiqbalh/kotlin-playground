fun main() {

    var result = pengurangan(100, 90)
    println(result)

    hi("Nanda")

}

fun pengurangan(a: Int, b: Int): Int = a - b

fun hi(nama: String) :Unit = println("Hello $nama")