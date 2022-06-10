fun main() {

    val finalExam = 'A'

    when (finalExam){
        'A' -> {
            println("Perfect")
        }
        'B' -> {
            println("Amazing")
        }
        'C' -> {
            println("Not Bad")
        }
        'D' -> {
            println("Lulus Mepet")
        }
        'E' -> {
                println("Tidak Lulus")
        }
            else -> println("Ups, data tidak valid")
        }

    // when with multiple option
    when (finalExam) {
        'A', 'B', 'C' -> {
            println("Selamat anda lulus")
        }
        else -> {
            println("Maaf anda tidak lulus")
        }
    }

    // when with in
    val passExam = arrayOf('A', 'B', 'C')

    when (finalExam){

        in passExam -> {
            println("Selamat anda lulus")
        }

        !in passExam -> {
            println("Anda tidak lulus")
        }
    }

    // when is
    val name = "Eko"
    when (name) {
        is String ->{
            println("Name is string")
        }

        !is String -> {
            println("Name isnt string")
        }
    }
}