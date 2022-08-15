package binar

import java.util.*

var statusMasukkan = true
val userInput = Scanner(System.`in`)

fun main() {

    while (statusMasukkan){

        println("=========================================")
        println("PROGRAM PENENTU BILANGAN GANJIL DAN GENAP")
        println("=========================================")

        print("\nMasukkan bilangan yang ingin anda cek: ")

        try {
            val bilanganInput = userInput.nextInt()
            penentuTipeBilangan(bilanganInput)
        } catch (e: InputMismatchException) {
            System.err.println("Sayang sekali, kamu memasukkan yang bukan angka :(\n")
            break
        }

        // menanyakan ke user setiap setelah mengecek
        isContinue()

    }


}

private fun penentuTipeBilangan(bilangan: Int){

    when {
        bilangan % 2 == 0 -> {
            println("$bilangan adalah bilangan genap")
        }
        bilangan % 2 != 0 -> {
            println("$bilangan adalah bilangan ganjil")
        }
        else -> {
            System.err.println("Yang anda masukkan itu bukan angka bos :(")
        }

    }

}

// function untuk menanyakan apakah user pengen ngecek bilangan lagi atau engga
private fun isContinue() {

    // ask for user input, wether the user want to continue the program or not
    print("\nApakah anda ingin mengecek lagi? [yes/no]: ")
    val statusUser = userInput.nextLine()

    when {
        statusUser.equals("No", ignoreCase = true) -> {
            println("\nTerima kasih!")
            statusMasukkan = false
        }
        statusUser.equals("Yes", ignoreCase = true) -> {
            println("\nSilahkan pilih lagi!")
        }
        else -> {
            System.err.println("Inputan anda tidak tepat. Anda dikeluarkan dari program!")
            statusMasukkan = false
        }
    }
}