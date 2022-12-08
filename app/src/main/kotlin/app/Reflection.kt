package app

import data.CreateCategoryRequest
import data.CreateProductRequest
import exception.ValidationException

//validasi secara manual
fun validateRequest(request: CreateProductRequest) {
    when {
        request.id == "" -> throw ValidationException("id is blank")
        request.name == "" -> throw ValidationException("name is blank")
    }
}

fun validateRequest(request: CreateCategoryRequest) {
    when {
        request.id == "" -> throw ValidationException("id is blank")
        request.name == "" -> throw ValidationException("name is blank")
    }
}

//cara validasi menggunakan anotation
fun valRequest(request: Any) {
}