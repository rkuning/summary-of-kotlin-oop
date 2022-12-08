package app

import exception.ValidationException
import java.lang.NullPointerException


fun validateAndSayHello(name : String) {
    if(name.isBlank()) {
        throw ValidationException("name is blank")
    } else {
        println("Hello $name")
    }
}

fun main() {
    try {
        validateAndSayHello("Danang")
        validateAndSayHello("")
//        program stop karena kode di atas error, sehingga kode dibawah ini tidak akan di eksekusi
        println("danang")
    } catch (error : ValidationException){
        println("Terjadi error validation ${error.msg}")
    } catch (error : NullPointerException) {
        println("Terjadi error null pointer ${error.message}")
    } catch (error : Throwable) {
        println("Terjadi error throwable ${error.message}")
    } finally {
        println("program selesai")
    }
}