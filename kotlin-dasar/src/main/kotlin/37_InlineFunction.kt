fun main() {

    println(helloInline { "Nanda" })
    println(helloInline { "Iqbal Hanafi" })
}

inline fun helloInline(name: () -> String) :String{
    return "Hello ${name()}"
}