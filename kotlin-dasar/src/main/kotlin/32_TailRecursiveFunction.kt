fun main() {
    display(100000)
}

tailrec fun display(value: Int){
    println(value)
    if (value > 0 ){
        display(value - 1)
    }
}