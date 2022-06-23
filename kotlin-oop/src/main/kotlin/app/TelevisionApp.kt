package app

import data.Television

fun main() {

    val television1 = Television()

    // akan error karena brand belum diinisialisasi
//    println(television1.brand)

    // akan sukses karena sudah memanggil init function untuk inisialisasi
    television1.initTelevision()
    println(television1.brand)

}