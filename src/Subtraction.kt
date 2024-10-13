import java.util.*

/**
 * This class is used to perform subtraction of two numbers.
 */
class Subtraction {
    fun performOperation(scanner: Scanner) {
        println("Enter two numbers to subtract:")
        val a = scanner.nextDouble()
        val b = scanner.nextDouble()
        println("Result: ${a - b}")
    }
}