package functional

fun main(args: Array<String>) {

    val props = System.getProperties()

    // This allows us to use the functions on props without
    // having to use the dot operator ex: props.list(System.out) or props.propertyNames().toList()
    with(props) {
        list(System.out)
        println(propertyNames().toList())
        println(getProperty("user.home"))
    }
}