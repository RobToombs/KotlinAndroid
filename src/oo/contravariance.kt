package oo

// 'out' implies that this class will only ever 'produce' 'T' types
class Source<out T>(val t: T) {

    fun produceT(): T {
        return t
    }
}

// 'in' implies that this class will ever only 'consume' 'T' types
// and will never produce them
class Sink<in T> {

    fun consumeT(t: T) {
        // ...
    }

}

fun main(args: Array<String>) {
    val strSource: Source<String> = Source("Producer")
    val anySource: Source<Any> = strSource // out -> covariance
    anySource.produceT()

    val anySink: Sink<Any> = Sink()
    val strSink: Sink<String> = anySink // in -> contravariance
    strSink.consumeT("Consumer")

    // Invariance = neither covariant nor contravariant <? super E>
}