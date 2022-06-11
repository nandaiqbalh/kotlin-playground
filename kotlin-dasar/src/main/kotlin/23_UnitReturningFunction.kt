fun main() {

    printHello(null)

}

// penggunaan kata Unit tidaklah wajib
fun printHello(name: String?) :Unit{

    if (name == null){
        println("Hello Bro")
    } else {
        print("Hello $name")
    }
}