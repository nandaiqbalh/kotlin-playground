package data

open class Employee(val name:String) {

    fun sayHelloeEmployee(name: String){
        println("Hello $name, my name is ${this.name}")
    }

    // overriding function
    open fun helloUntukOverride(name: String){
        println("Hello ${name}, my name is ${this.name}")
    }
}