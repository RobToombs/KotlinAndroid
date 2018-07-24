package functional

import kotlin.system.measureTimeMillis

fun main(args: Array<String>)
{
    val veryLongList = (1..999999L).toList()

     val msNonLazy = measureTimeMillis {
        veryLongList
                .filter{it > 50}
                .map {it * 2}
                .take(1000)
                .sum()
    }

    val msLazy = measureTimeMillis {
        veryLongList
                .asSequence()
                .filter{it > 50}
                .map {it * 2}
                .take(1000)
                .sum()
    }

    println("Non-Lazy: $msNonLazy ms, Lazy: $msLazy ms")
}