package oo

fun Bicycle.replaceWheel() {
    println("Replacing wheel...")
}

fun Boat.startingEngine(): Boolean {
    println("Starting engine...")
    return true
}

fun main(args: Array<String>) {
    val vehicle: Drivable = Bicycle()
    vehicle.drive()

    // instanceof in Java is the same as 'is' in Kotlin
    if(vehicle is Bicycle) {
        vehicle.replaceWheel()
    }
    else if (vehicle is Boat) {
        vehicle.startingEngine()
    }

    if(vehicle is Boat && vehicle.startingEngine()) {
        // Do whatever you want
    }

    if(vehicle !is Boat || vehicle.startingEngine()) {
        // ...
    }

    if(vehicle !is Bicycle) {
        return
    }

    // This is possible because we now know that the vehicle has to be
    // a bike because of the above "vehicle !is Bicycle" return logic
    vehicle.replaceWheel()
}