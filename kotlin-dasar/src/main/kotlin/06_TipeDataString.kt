fun main() {

    // string satu baris
    var firstName: String = "Nanda"
    var lastName: String = "Iqbal Hanafi"


    // string lebih dari satu baris
    var namaLebihSatuBaris: String = """
        >Nanda,
        >Iqbal,
        >Hanafi,
        >Fernandes
        """.trimMargin(">")
    // trim margin biar trim simbol tertentu

    println(firstName)
    println(lastName)
    println(namaLebihSatuBaris)

    var fullName: String = "$firstName $lastName"
    println(fullName)

    var desc: String = "$fullName length = ${fullName.length}"
    println(desc)
}