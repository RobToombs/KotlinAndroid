package oo

class City {
    // If we want to explicitly create the getters and setters
    var name: String = ""
        get() = field
        set(value) {
            if(value.isNotBlank()) {
                field = value
            }
        }

    // If we want the implicit getters and setters
    var population: Int = 0
}

fun main(args: Array<String>) {
    val berlin = City()

    // These implicitly call getters and setters
    berlin.name = "Berlin"
    berlin.name = "    "
    berlin.population = 3_500_000

    println(berlin.name)
    println(berlin.population)
}
