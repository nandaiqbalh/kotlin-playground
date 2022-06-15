fun main() {

    val anonymousUpper = fun(value: String): String {
        if (value.isBlank()){
            return "Ups"
        }

        return value.toUpperCase()
    }

    val result1 = helloHigh1("Nanda", anonymousUpper)
    println(result1)

    // anonymous function as parameter
    println(helloHigh1("NANDA", fun(value: String): String{
        return value.toLowerCase()
    }))
}

fun helloHigh1(value: String, transformer: (String) -> String): String {
    return "Hello ${transformer(value)}"
}

