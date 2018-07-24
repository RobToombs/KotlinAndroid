package oo

// private - same as in Java
// protected - same as in Java
// internal - visible inside the same module
// public - same as in Java (default)

private class Car(val brand: String, private val model: String) {

}

fun main(args: Array<String>) {
    val car = Car("BRAND", "MODEL")
    car.brand

}