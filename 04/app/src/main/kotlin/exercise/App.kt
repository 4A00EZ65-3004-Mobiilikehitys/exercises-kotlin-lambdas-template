package exercise


/**
 * Main function to demonstrate fetching speeds from various nested nullable properties.
 */
fun main() {
    val jack = Person()

    val speedA: Int? = getSpeedA(jack)
    val speedB: Int? = getSpeedB(jack)
    val speedC: Any = getSpeedC(jack)
    println(speedA)
    println(speedB)
    println(speedC)

    try {
        val speedD: Int? = getSpeedD(jack)
        println(speedD)
    } catch (e: NullPointerException) {
        println("could not fetch the speed")
    }
}

