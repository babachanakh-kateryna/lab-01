import java.util.*

/**
 * This class is used to perform multiplication of two numbers.
 */
class Multiplication {
    fun performOperation(scanner: Scanner) {
        println("Enter two numbers to multiply:")
        val a = scanner.nextDouble()
        val b = scanner.nextDouble()
        println("Result: ${a * b}")
    }
}