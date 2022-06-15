import java.sql.Struct

fun main() {

    val upperTransformer = { value: String -> value.toUpperCase() }
    val lowerTransformer = { value: String -> value.toLowerCase() }

    println(helloHigh("Nanda", upperTransformer))
    println(helloHigh("IQBAL", lowerTransformer))

    // trailing lambda
    val result1 = helloHigh("Nanda Iqbal Hanafi") {value: String ->
        value.toUpperCase()
    }

    val result2 = helloHigh("Nanda Iqbal Hanafi") {value: String ->
        value.toLowerCase()
    }

    println(result1)
    println(result2)

}

fun helloHigh(value: String, transformer: (String) -> String): String {
    return "Hello ${transformer(value)}"
}