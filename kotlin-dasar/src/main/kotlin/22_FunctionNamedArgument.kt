fun main() {

    // pemanggilan bisa dibolak balik posisi parameternya
    sayHelloNamed(firstName = "Nanda", lastName = "Hanafi", middleName = "Iqbal")
}

fun sayHelloNamed(firstName: String, middleName: String, lastName: String){
    println("Halo, $firstName $middleName $lastName")
}