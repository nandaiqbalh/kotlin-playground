package binar.satu

class Karakter(private val type: String, private val firstName: String?, private val middleName: String?, private val lastName:String?) {

    // secondary constructor
    constructor(type: String,firstName: String?, lastName:String?) :
            this(type, firstName, null, lastName){

                // do something
            }


    fun berbicara(yourName: String){

        // check wether middleName is null or not (using primary or secondary constructor)
        if (middleName != null){
            println("Hello $yourName, saya seorang $type, namaku adalah ${"$firstName $middleName $lastName"}")
        } else {
            println("Hello $yourName, saya seorang $type, namaku adalah ${"$firstName $lastName"}")
        }
    }

    fun berjalan(jarak: Int?){
        if (jarak == null){
            println("Nama panggilanku $firstName, dan aku suka berjalan.")

        } else {
            println("Nama panggilanku $firstName, dan aku suka berjalan. Aku biasa berjalan sejauh $jarak km lhoh!")

        }
    }

    fun makan(makananKesukaan: String){
        println("Aku $type, namaku $firstName, makanan kesukaanku adalah $makananKesukaan")
    }
}

fun main() {

    // make object using secondary constructor
    val guruMatematika = Karakter("Guru Matematika", "Nanda", "Hanafi")
    guruMatematika.berbicara("Donny")
    guruMatematika.berjalan(null)
    guruMatematika.makan("Bakso")

    // make object using primary constructor
    val pengusaha = Karakter("Pengusaha", "Nanda", "Iqbal","Hanafi")
    pengusaha.berbicara("Danu")
    pengusaha.makan("Mie Ayam")

    // make object using primary constructor
    val atlet = Karakter("Atlet", "Bruno", "Fernandes", "de Santos")
    atlet.berjalan(120)
    atlet.makan("Gado-gado")

}