import java.util.Scanner

/**
 * This is the main function that runs the calculator.
 */
fun main() {
    val scanner = Scanner(System.`in`)

    while (true) {
        println("Choose operation:")
        println("1. Adding (+)")
        println("2. Subtraction (-)")
        println("3. Multiplication (*)")
        println("4. Division (/)")
        println("5. Conversion of lengths (m, cm, mm)") // individual task - Option 1
        println("6. Calculation of the volume of a cube") // individual task - Option 8
        println("7. Exit")

        when (scanner.nextInt()) {
            1 -> {
                val addition = Addition()
                addition.performOperation(scanner)
            }
            2 -> {
                val subtraction = Subtraction()
                subtraction.performOperation(scanner)
            }
            3 -> {
                val multiplication = Multiplication()
                multiplication.performOperation(scanner)
            }
            4 -> {
                val division = Division()
                division.performOperation(scanner)
            }
            5 -> {
                // TO DO
            }
            6 -> {
                // TO DO
            }
            7 -> {
                println("Exit the program...")
                break
            }
            else -> println("Wrong choice. Try again.")
        }
    }
}
