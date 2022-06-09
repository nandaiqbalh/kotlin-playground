fun main() {

    // berdasarkan tabel kebenaran dari masing-masing operator
    val finalExam = 80
    val attendance = 81

    val passFinalExam = 75
    val passAttendance = 75

    val result = finalExam >= passFinalExam && attendance >= passAttendance
    println(result)

}