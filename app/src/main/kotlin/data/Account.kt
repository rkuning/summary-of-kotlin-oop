package data

import kotlin.properties.Delegates

class Account(descrip : String = "") {
    val name : String by lazy {
        println("name is called")
        "danang"
    }

//    observable properties : fungsinya untuk melacak perubahan pada suatu value
    var descrip : String by Delegates.observable(descrip) {
        property, oldValue, newValue ->
        println("${property.name} change from $oldValue to $newValue ")
    }
}