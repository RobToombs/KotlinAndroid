package oo

// Creates the name and areaSqKm fields for country, sets their types, and creates getters/setters
// for them in the parameter area. VERRRRRNICEEEE, HOW MUCH?
// This is the main constructor, but secondary constructors can be named within
// but it must delegate to the primary constructor within
class Country(val name: String, val areaSqKm: Int) {

    // Secondary constructor
    constructor(name: String) : this(name, 0) {
        println("Constructor called")
    }

    fun print() = "$name, $areaSqKm km^2"
}

fun main(args: Array<String>) {
    val australia = Country("Australia", 7_700_000)
    println(australia.name)
    println(australia.areaSqKm)

    val spain = Country("Spain")
    println(spain.name)
    println(spain.areaSqKm)
}