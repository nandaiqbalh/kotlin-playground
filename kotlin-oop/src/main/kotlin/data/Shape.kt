package data

open class Shape {
    open val corner: Int = 0

    open fun printName(){
        println("This is from Shape")
    }
}