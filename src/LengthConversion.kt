import java.util.*

/**
 * This class performs the length conversion operation.
 */
class LengthConversion {
    fun performOperation(scanner: Scanner) {
        println("Choose the unit to convert from:")
        println("1. Meter (m)")
        println("2. Centimeter (cm)")
        println("3. Millimeter (mm)")

        val choice = scanner.nextInt()
        println("Enter value to convert:")
        val value = scanner.nextDouble()

        when (choice) {
            1 -> {
                println("Meters to centimeters: ${value * 100}")
                println("Meters to millimeters: ${value * 1000}")
            }
            2 -> {
                println("Centimeters in meters: ${value / 100}")
                println("Centimeters to millimeters: ${value * 10}")
            }
            3 -> {
                println("Millimeters to meters: ${value / 1000}")
                println("Millimeters to centimeters: ${value / 10}")
            }
            else -> println("Wrong choice.")
        }
    }
}