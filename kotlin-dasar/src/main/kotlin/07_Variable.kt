
// ini untuk constant
const val APPLICATION_NAME = "Nanda Kotlin Playground"

fun main() {

    // var : mutable
    // val : immutable

    var firstName = "Nanda"
    firstName = "Iqbal" // ini gaakan error karena mutable

    println(firstName)

    val fixedName = "Nanda Iqbal Hanafi"
    val fixedAge = 20


//    fixedAge = 21 // ini akan error karena val immutable

    val akhirStatement = "$fixedName berumur $fixedAge"
    println(akhirStatement)

    // NULLABLE

    // dalam kotlin, pembuatan variabel harus sekalian dikasih nilai
    // kalau tidak, maka akan error. TAPI, ada syntax yang bisa dilakukan meskipun tidak direkomendasikan
    // yaitu tanda ?

    var namaBolehNull:String? = "Nanda"
    namaBolehNull = null

    println(namaBolehNull)
    println(namaBolehNull?.length)

    namaBolehNull = "Nanda"
    println(namaBolehNull)


    // CONSTANT
    println(APPLICATION_NAME)

}