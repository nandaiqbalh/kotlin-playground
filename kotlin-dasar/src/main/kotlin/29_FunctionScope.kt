fun main() {

    // function ini hanya akan bisa diakses di function main
    fun HelloNanda(){
        println("Hello Nanda")
    }

    // pengaksesan
    HelloNanda()
}

fun satu(){

    // akan error
    // HelloNanda()
}

fun dua(){
    // akan error
    // HelloNanda()
}