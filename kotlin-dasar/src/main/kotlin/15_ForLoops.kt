fun main() {

    val names = arrayOf("Nanda", "Iqbal", "Hanafi")

    for (name in names){
        println(name)
    }

    for (value in 1..5){
        println(value)
    }

    var total = 0
    for (value in 400 downTo 1 step 100){
        println(value)
        total++
    }

    println("Total perulangan = $total")

}