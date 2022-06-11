fun main() {

    var i = 0

    while (true){
        println("Ini perulangan ke $i")
        i++
        if (i > 5){
            break
        }
    }

    println("\n")

    for (a in 1..5){

        if (a % 2 == 0){
            continue
        }
        println("Ini perulangan ke $a")

    }

}