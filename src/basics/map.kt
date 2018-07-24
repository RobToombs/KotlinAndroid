package basics

fun main(args: Array<String>) {

    var list = (1..100).toList()
    var doubled = list.map { element -> element * 2 }
    println(doubled)

    val average = list.average()
    val shifted = list.map{ it - average}

    println(doubled)
    println(shifted)

    val nestedList =  listOf(
            (1..10).toList(),
            (11..20).toList(),
            (21..30).toList()
    )

    val notFlattened = nestedList.map{it.sortedDescending()}
    val flattened = nestedList.flatMap{it.sortedDescending()}

    println(notFlattened)
    println(flattened)
}