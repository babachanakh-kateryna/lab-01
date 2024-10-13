import java.util.*

/**
 * This class is used to perform addition of two numbers.
 */
class Addition {
    fun performOperation(scanner: Scanner) {
        println("Enter two numbers to add:")
        val a = scanner.nextDouble()
        val b = scanner.nextDouble()
        println("Result: ${a + b}")
    }
}