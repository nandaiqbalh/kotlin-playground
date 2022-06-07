fun main() {

    val names: Array<String> = arrayOf("Nanda", "Iqbal", "Hanafi")
    val ages: Array<Byte> = arrayOf(20, 24, 32)

    // akses value
    print(names[1])
    print(" berumur ")
    println(ages.get(1))

    // ubah nilai array
    println(names.get(0))
    names.set(0, "Bruno")
    println(names.get(0))

    // NULLABLE ARRAY
    val namesBolehNull: Array<String?> = arrayOfNulls(3)
    println(namesBolehNull[1])

}