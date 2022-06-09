fun main() {


    // kalop pake integer, hasilnya tidak akan ada komanya
    var result = 10 / 3
    println(result)

    // double
    var result2 = 10.0 / 3
    println(result2)

    var pipolondo = 10 + 10 / 2
    println(pipolondo)

    // augmented assignment
    var total = 0

    var barang1 = 100
    var barang2 = 200
    var barang3 = 300

//    total = total + barang1
//    total = total + barang2
//    total = total + barang3
    // bisa disingkat menjadi

    total += barang1
    total += barang2
    total += barang3

    println("\nAugmented assignment")
    println(total)
}