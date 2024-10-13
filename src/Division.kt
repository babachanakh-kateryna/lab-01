import java.util.*

/**
 * This class performs the division operation.
 */
class Division {
    fun performOperation(scanner: Scanner) {
        println("Enter two numbers to divide:")
        val a = scanner.nextDouble()
        val b = scanner.nextDouble()
        if (b != 0.0) {
            println("Result: ${a / b}")
        } else {
            println("Error: division by zero!")
        }
    }
}