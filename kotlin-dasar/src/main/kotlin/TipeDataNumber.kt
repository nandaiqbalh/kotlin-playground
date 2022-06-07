fun main() {

    // integer number
    var nomorByte : Byte = 8 // byte -128 sampai 127
    var nomorShort : Short = 1231
    var nomorInt : Int = 124142
    var nomorLong : Long = 214132513L

    println(" $nomorByte $nomorShort $nomorInt $nomorLong")

    // floating number
    var value : Float = 12.2F // float harus ada F nya
    var radius : Double = 12413134.124

    println(" $value $radius")

    // literal number
    var decimalLiteral : Int = 12143 // otomatis langsung bilangan integer biasa
    var hexadecimalLiteral : Int = 0XFF // bilangan hexa
    var binaryLiteral : Int = 0b10101010 // bilangan biner

    println(" $decimalLiteral $hexadecimalLiteral $binaryLiteral")

    // underscore in number
    // berguna untuk mempermudah dalam membaca
    var underscoreLong : Long = 124_214_143_500L
    println(underscoreLong)

    // convertion
    var convertionDouble: Double = nomorInt.toDouble()
    println(convertionDouble)
}