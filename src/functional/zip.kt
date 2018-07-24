package functional

fun main(args: Array<String>) {

    val list = listOf("Hi", "there", "kotlin", "fans")
    val containsT = listOf(false, true, true, false)

    //Pair<String, Boolean>
    val zipped: List<Pair<String, Boolean>> = list.zip(containsT)
    val mapping = list.zip(list.map{it.contains("t")})

    val map = list.map { it.contains("t") }

    println(zipped)
    println(map)
    println(mapping)

}