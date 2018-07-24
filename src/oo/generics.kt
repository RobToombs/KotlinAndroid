package oo

import java.util.*

val list: List<Int> = listOf(1,2,3)

class TimeSeries<E> {

    val date2Data: MutableMap<Date, E> = mutableMapOf()

    fun add(element: E) {
        date2Data.put(Date(), element)
    }

    fun addAll(elements: Collection<E>) {
        elements.forEach {add(it)}
    }

    fun getLatest(): E {
        return date2Data.values.last()
    }
}

// Established generic in 'E'
// Takes in as many generic elements as required
// Returns a timeline with those generic elements
fun <E> timeSeriesOf(vararg elements: E): TimeSeries<E> {
    val result = TimeSeries<E>()
    for(element in elements) {
        result.add(element)
    }

    return result
}

fun main(args: Array<String>) {
    val timeSeries: TimeSeries<Int> = TimeSeries()
    timeSeries.add(2)
    timeSeries.getLatest()

    val timeline2 = timeSeriesOf(1, 2, 3, 4)
    val timeline3 = timeSeriesOf("", "Second", "Third")
}