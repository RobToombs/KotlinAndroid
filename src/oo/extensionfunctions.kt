package oo

fun Int.isEven() = (this % 2 == 0)

// Extending one of our own classes
fun City.isLarge() = population > 1_000_000

fun main(args: Array<String>) {
    println(5.isEven())

    val naturals = listOf(1, 3, 4, 11, 5, 6)
    println(naturals.filter { it.isEven() })

    val austin = City()
    austin.name= "Austin"
    austin.population = 950_000
    println(austin.isLarge())
}