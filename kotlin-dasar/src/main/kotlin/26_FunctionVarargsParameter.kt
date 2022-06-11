fun main() {

    hitungTotal("Nanda", 10, 10, 10, 100, 23)

}

fun hitungTotal(name: String, vararg values:Int){
    var total = 0
    for (value in values){
        total += value
    }

    println("Final value = $name $total")
}