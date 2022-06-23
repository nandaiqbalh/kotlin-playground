package app

import data.Shape

fun main() {

    val shape1 = Shape()
    // ini akan print untuk corner yang ada di Shape
    println(shape1.corner)

    val rectangle1 = Rectangle()
    // ini akan print untuk corner yang ada di rectangle
    println(rectangle1.corner)

    // super keyword
    val rectangle2 = Rectangle()
    println("Nilai dari parent corner adalah ${rectangle2.cornerParent}")

    // super keyword untuk method
    val triangle1 = Triangle()
    triangle1.printName()
}

class Rectangle : Shape (){

    // overriding properties
    override val corner: Int = 4

    // super keyword untuk amnbil apa yang ada di parent
    val cornerParent = super.corner
}

class Triangle: Shape(){

    override val corner: Int = 3

    override fun printName() {

        println("This is from triangle")
        super.printName()
    }

}