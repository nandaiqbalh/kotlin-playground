class Person {

        // ini properties
        var name: String = ""
        var age: Int = 0
        var address: String? = null

}

fun main() {
    var person1 = Person()
    person1.name = "Nanda Iqbal Hanafi"
    person1.age = 20

    println("${person1.name} berusia ${person1.age} tahun")
}