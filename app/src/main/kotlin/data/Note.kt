package data

class Note(title : String) {
    var title : String = title
    get() {
        println("call getter")
        return field
    }

    set(value) {
        if(value.isNotBlank()) {
            field = value
        } else {
            println("blank inpput")
        }
    }
}

class BigNote(val title : String) {
    val bigTitle : String
    get() = title.toUpperCase()
}