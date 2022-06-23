package data

class Student(var name: String) {

    fun helloStudent(yourName: String){
        println("Hello $yourName, my name is $name")
    }

    fun runAyo(){
        println("Ayo berlari")
    }

    // overloading -> function yang namanya sama -> parameternya harus beda (baik dari jumlah atau tipenya)\
    fun sayHelloStudent(yourName: String){
        println("Hello ${yourName}, my name is ${name}")
    }

    fun sayHelloStudent(firstName: String, lastName: String){
        println("Hello ${firstName} ${lastName}, my name is ${name}")
    }

    // this keyword
    // misal ada nama properties yang sama dengan nama parameter, kode this akan mereference ke properties
    fun namaMurid(name: String){
        println("Hello, ${name}, my Name is ${this.name}")
    }
}