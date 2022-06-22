package data

class Student(var name: String) {

    fun helloStudent(yourName: String){
        println("Hello $yourName, my name is $name")
    }

    fun runAyo(){
        println("Ayo berlari")
    }
}