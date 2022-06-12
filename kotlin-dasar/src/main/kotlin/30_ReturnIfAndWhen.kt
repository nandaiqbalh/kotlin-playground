fun main() {
    katakanHello("")
    katakanHello("Nanda Iqbal Hanafi")

    katakanHelloDenganWhen("")
    katakanHelloDenganWhen("Nanda")
    katakanHelloDenganWhen("Bruno Fernandes")
}

fun katakanHello(name: String = ""){
    if (name == ""){
        println("Hello Broooo!!")
    } else {
        println("Hello $name")
    }
}
fun katakanHelloDenganWhen(name:String = ""){
    when(name){
        "" -> {
            println("Hello Bro When")
        }
        "Nanda" -> {
            println("Hello Nanda pake when")
        }
        else-> {
            println("Hello $name pake else")
        }
    }
}