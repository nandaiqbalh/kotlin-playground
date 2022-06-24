package app

import data.Gender

fun main() {
    val woman = Gender.FEMALE
    val man = Gender.MALE
    val listGenders: Array<Gender> = Gender.values()

    println(woman)
    println(man)
    print(listOf(listGenders.toList()))
}