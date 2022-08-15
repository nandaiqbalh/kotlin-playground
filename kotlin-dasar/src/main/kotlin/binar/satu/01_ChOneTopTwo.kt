package binar

fun main() {
    cobaList()
}

private fun cobaList(){
    val mutableList = mutableListOf(1, "Nanda", true, 0.2F)
    println(mutableList)
    mutableList.add(false)
    println(mutableList)
    mutableList.removeAll(listOf(1))
    println(mutableList)
    mutableList.add(1, "Halo")
    println(mutableList)

    if (mutableList.contains(2)){
        println("Ada")
    } else {
        println("Tidak ada")
    }

    val index = listOf(2, 3, 5, 8)
    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(index.intersect(total))

}