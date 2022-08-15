package binar

import binar.satu.Manusia

fun main() {

    val manusia1 = Manusia(lastName = "Iqbal", firstName = "Nanda")
    manusia1.cetak()

    // pemanggilan bisa dibolak balik posisi parameternya
    sayHelloNamed(firstName = "Nanda", lastName = "Hanafi", middleName = "Iqbal")
}

fun sayHelloNamed(firstName: String, middleName: String, lastName: String){
    println("Halo, $firstName $middleName $lastName")
}