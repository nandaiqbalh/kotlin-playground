package app

import data.MyData

fun main() {

    // misal mau bikin datanya bertipe string
    val myDataString: MyData<String, Int> = MyData<String, Int>("Nanda Iqbal Hanafi", 100)
    myDataString.printData()

    // bisa juga kalau mau bikin data bertipe Int
    val myDataInt: MyData<Int, String> = MyData<Int, String>(10, "Nanda")
    myDataInt.printData()
}