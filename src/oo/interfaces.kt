package oo

interface Drivable {
    fun drive() {
        println("Driving (interface)")
    }
}

class Bicycle : Drivable {
    override fun drive() {
        println("Driving Bicycle")
    }
}

class Boat : Drivable {
    override fun drive() {
        println("Driving Boat")
    }
}

fun main(args: Array<String>) {
    val drivable: Drivable = Bicycle()
    drivable.drive()
}