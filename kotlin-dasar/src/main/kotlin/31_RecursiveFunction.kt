fun main() {
    factorialLoopBiasa(5)

    var hasilRecursive = factorialRecursive(5)
    println("\n$hasilRecursive")
}
// factorial loop biasa
fun factorialLoopBiasa(value: Int): Int{
    var result = 1
    for (i in 1..value){
        result *= i
        print("$result ")
    }
    return result
}

fun factorialRecursive(value: Int): Int{

    return when (value){
        1 -> 1
        else -> value * factorialRecursive(value - 1)
    }
}