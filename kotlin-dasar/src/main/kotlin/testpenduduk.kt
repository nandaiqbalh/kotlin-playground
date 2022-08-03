fun main() {
    penduduk()
    check()
}

private fun penduduk(){

    var jumlahPenduduk = 1L

    // looping 2 - 50, kenapa dari 2? karena operasi dimulai di hari kedua (hari 1 penduduknya tetap)
    for (hari in 2..4){

        // cek apakah hari bisa dibagi 3, kalo bisa dibagi 3, penduduknya dibagi 2
        if (hari % 3 == 0){
            jumlahPenduduk /= 2
        } else {
            // kalo tidak bisa, penduduknya dikali 3
            jumlahPenduduk *= 3
        }
    }
    val printJumlah = "Jumlah penduduk: $jumlahPenduduk"
    println(printJumlah)

}

private fun check(){

    var nama: String
    val umur = 21
    println(umur)
}