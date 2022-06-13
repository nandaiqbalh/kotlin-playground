fun main() {

    // membuat lambda
    val lambdaName: (String) -> String = { value: String ->
        value.toUpperCase()
    }

    // mengeksekusi lambda
    val name = lambdaName("Nanda")
    println(name)

    // contoh lambda dengan dua parameter
    val contohLambda: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }

    // memanggil lambda
    println(contohLambda("Nanda", "Iqbal"))
}