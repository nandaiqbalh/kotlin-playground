package app

import data.Shape

fun main() {

    val shape1 = Shape()
    // ini akan print untuk corner yang ada di Shape
    println(shape1.corner)

    val rectangle1 = Rectangle()
    // ini akan print untuk corner yang ada di rectangle
    println(rectangle1.corner)

}

class Rectangle : Shape (){

    // overriding properties
    override val corner: Int = 5
}