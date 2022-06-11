fun main() {

    var hasilFunction = "Nanda Iqbal Hanafi" to "UP"

    println(hasilFunction)

}

infix fun String.to(type: String): String{

    if (type == "UP"){
        return this.toUpperCase()
    } else {
        return this.toLowerCase()
    }

}