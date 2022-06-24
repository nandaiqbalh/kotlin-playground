package app

import data.Action

fun main() {

    fireAction(SampleAction())

    // anonymous class
    fireAction(object : Action{
        override fun action() {
            println("This is action one")
        }
    })

    fireAction(object : Action{
        override fun action() {
            println("This is action two")
        }
    })

}

fun fireAction(action: Action){
    action.action()
}

// contoh kalau tidak lewat anonymous class
class SampleAction : Action{
    override fun action() {
        println("This is sample action")
    }
}