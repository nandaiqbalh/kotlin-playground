package data

open class Employee(val name:String) {

    fun sayHelloeEmployee(name: String){
        println("Hello $name, my name is ${this.name}")
    }
}