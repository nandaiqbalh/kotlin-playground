package app

import data.Student

fun main() {

    // pemanggilan
    val student1 = Student("Nanda")
    student1.helloStudent("Bruno")
    student1.runAyo()

    // overloading function
    val student2 = Student("Nanda Iqbal Hanafi")
    student2.sayHelloStudent("Bruno Fernandes")
    student2.sayHelloStudent("Luke", "Shaw")
}