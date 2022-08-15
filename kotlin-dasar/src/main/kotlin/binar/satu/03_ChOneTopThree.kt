package binar

fun main() {

    converttoifexpression()
}

private fun converttoifexpression(){
    var tipeData: Any = 10.0f

    if (tipeData is Float){
        println("Float")
    } else if (tipeData is String){
        println("String")
    } else if (tipeData is Int){
        println("Integer")
    } else {
        println("Else")
    }

}
