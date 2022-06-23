package data

class Note(title: String) {
    var title: String = title

    // getter, akan mereference ke var
    get() {

        println("Memanggil getter function")
        return field
    }

    // setter
    set(value) {
        println("Memangil setter function")
        if (value.isNotBlank()){
            field = value
        } else {
            println("Invalid title")
        }
    }
}