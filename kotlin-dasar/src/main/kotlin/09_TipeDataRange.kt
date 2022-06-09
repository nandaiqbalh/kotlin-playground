fun main() {

    val iniRange = 1..10

    // cek apakah mengandung nilai (keluarannya akan true/false)
    println(iniRange.contains(3))

    // range terbalik
    val rangeTerbalik = 1000 downTo 1

    // range dengan step
    val rangeStepLima = 5..50 step 5
    val rangeStepTerbalik = 100 downTo 0 step 20
}