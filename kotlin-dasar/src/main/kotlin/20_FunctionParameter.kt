fun main() {

    // memanggil function dengan memasukkan parameter
    sayHello("Nanda", "Iqbal")
    sayHello("Bruno", null)
    sayHello("Luke", "Shaw")
}


// membuat function dengan paramter
fun sayHello(firstName: String, lastName: String?){

    if (lastName == null){
        println("Hello $firstName")
    } else  {
        println("Hello $firstName $lastName")
    }
}