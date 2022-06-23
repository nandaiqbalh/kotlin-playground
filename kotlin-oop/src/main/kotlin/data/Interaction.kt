package data

interface Interaction {

    val name: String
    fun sayHello(name: String)

    // function di interface tidak wajib abstract
    fun katakanHello(name: String){
        println("Hello $name, my name is ${this.name}")

    }
}

interface Go{
    fun go(){
        println("Go!")
    }
}

class Human(override val name: String) : Interaction, Go{
    override fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }

}