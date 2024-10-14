import org.junit.Assert.assertTrue
import org.junit.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import java.util.*


/**
 * Test class for Calculator
 */
class CalculatorTest {

    /**
     * Test for addition
     */
    @Test
    fun test01_Addition_OK() {
        // Prepare input
        val input = "2\n3\n"
        val inStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inStream)

        val outStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outStream))

        // method under test
        val addition = Addition()
        addition.performOperation(Scanner(System.`in`))

        // verification
        assertTrue(outStream.toString().contains("Result: 5.0"))
    }

    /**
     * Test for subtraction
      */
    @Test
    fun test02_Subtraction_OK() {
        // Prepare input
        val input = "5\n2\n"
        val inStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inStream)

        val outStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outStream))

        // method under test
        val subtraction = Subtraction()
        subtraction.performOperation(Scanner(System.`in`))

        // verification
        assertTrue(outStream.toString().contains("Result: 3.0"))
    }

    /**
     * Test for multiplication
     */
    @Test
    fun test03_Multiplication_OK() {
        // Prepare input
        val input = "3\n4\n"
        val inStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inStream)

        val outStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outStream))

        // method under test
        val multiplication = Multiplication()
        multiplication.performOperation(Scanner(System.`in`))

        //  verification
        assertTrue(outStream.toString().contains("Result: 12.0"))
    }

    /**
     * Test for division
     */
    @Test
    fun test04_Division_OK() {
        // Prepare input
        val input = "10\n2\n"
        val inStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inStream)

        val outStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outStream))

        // method under test
        val division = Division()
        division.performOperation(Scanner(System.`in`))

        // verification
        assertTrue(outStream.toString().contains("Result: 5.0"))
    }

    /**
     * Test for division by zero
     */
    @Test
    fun test05_Division_ByZero() {
        // Prepare input
        val input = "10\n0\n"
        val inStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inStream)

        val outStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outStream))

        // method under test
        val division = Division()
        division.performOperation(Scanner(System.`in`))

        // verification
        assertTrue(outStream.toString().contains("Error: division by zero!"))
    }

    /**
     * Test for length conversion (meters)
     */
    @Test
    fun test06_LengthConversion_Meters() {
        // Prepare input
        val input = "1\n5\n"
        val inStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inStream)

        val outStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outStream))

        // method under test
        val lengthConversion = LengthConversion()
        lengthConversion.performOperation(Scanner(System.`in`))

        //  verification
        assertTrue(outStream.toString().contains("Meters to centimeters: 500.0"))
        assertTrue(outStream.toString().contains("Meters to millimeters: 5000.0"))
    }

    /**
     * Test for length conversion (centimeters)
     */
    @Test
    fun test07_LengthConversion_Centimeter() {
        // Prepare input
        val input = "2\n400\n"
        val inStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inStream)

        val outStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outStream))

        // method under test
        val lengthConversion = LengthConversion()
        lengthConversion.performOperation(Scanner(System.`in`))

        // verification
        assertTrue(outStream.toString().contains("Centimeters in meters: 4.0"))
        assertTrue(outStream.toString().contains("Centimeters to millimeters: 4000.0"))
    }

    /**
     * Test for length conversion (millimeter)
     */
    @Test
    fun test08_LengthConversion_Millimeter() {
        // Prepare input
        val input = "3\n3000\n"
        val inStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inStream)

        val outStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outStream))

        // method under test
        val lengthConversion = LengthConversion()
        lengthConversion.performOperation(Scanner(System.`in`))

        // verification
        assertTrue(outStream.toString().contains("Millimeters to meters: 3.0"))
        assertTrue(outStream.toString().contains("Millimeters to centimeters: 300.0"))
    }

    /**
     * Test for cube volume
     */
    @Test
    fun test09_CubeVolume_OK() {
        // Prepare input
        val input = "3\n"
        val inStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inStream)

        val outStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outStream))

        // method under test
        val cubeVolume = CubeVolume()
        cubeVolume.calculateVolume(Scanner(System.`in`))

        // verification
        assertTrue(outStream.toString().contains("The volume of a cube: 27.0 cubic units"))
    }
}
