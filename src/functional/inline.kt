package functional

fun main(args: Array<String>) {
    modifyString("Kotlin is amazing") {it.toUpperCase()}
}

// inline keyword stops the creation of an anonymous object to run the lambda for each invocation of the function
// creating this anonymous class each time can cause a lot of runtime overhead
inline fun modifyString(str: String, operation: (String) -> String): String {
    return operation(str)
}

// If your function takes in multiple lambdas and you don't want to inline one of them,
// you can put the noinline keyword in front of the parameter:
//inline fun modifyString(str: String, noinline operation: (String) -> String): String {
//    return operation(str)
//}