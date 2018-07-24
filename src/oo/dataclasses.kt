package oo

// Generates hashCode(), equals(), toString(), copy(), destructuring operator
data class Address(val street: String, val number: Int, val postCode: String, val city: String)

fun main(args: Array<String>) {
    val residence = Address("Main street", 42, "1234", "New York")
    val residence2 = Address("Main street", 42, "1234", "New York")

    // toString()
    println(residence)

    // Referential equality (same as == in Java)
    println(residence === residence2)

    // Structural equality (same as equals() in Java)
    println(residence == residence2)

    //copy(), sets number to 43 only in this instance
    val neighbor = residence.copy(number = 43)
    println(neighbor)
    println(residence)

    // Destructuring operator grabs the street
    residence.component1()

    // underscore ignores that entry
    val (street, number, _, city) = residence
    println("$street $number, $city")
}