package data

import annotations.NotBlank

class CreateProductRequest(
    @NotBlank val id : String,
    @NotBlank val name : String,
    val price : Long) {
}

data class CreateCategoryRequest(
    @NotBlank val id : String,
    @NotBlank val name : String)