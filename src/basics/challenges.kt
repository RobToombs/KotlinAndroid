package basics

fun main(args: Array<String>)
{
    dataAnalysisChallenges()
}

fun dataAnalysisChallenges()
{
    // Some faulty data with ages of our users
    val data = mapOf(
            "users1.csv" to listOf(32, 45, 17, -1, 34),
            "users2.csv" to listOf(19, -1, 67, 22),
            "users3.csv" to listOf(),
            "users4.csv" to listOf(56, 32, 18, 44)
    )

    val averageAge = data.flatMap {it.value}
            .filter { it >= 0 }
            .average()

    println(averageAge)

    val files = data.filter { it.value.any { it < 0 } }
            .map { it.key}

    println(files)

    val faults = data.flatMap { it.value }
            .filter { it < 0 }
            .count()

    println(faults)
}
