package data

sealed class Operation(val name : String) {

}

class Plus : Operation("Plus")
class Min : Operation("Min")
class Modulo : Operation("Modulo")