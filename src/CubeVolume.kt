import java.util.*

class CubeVolume {
    fun calculateVolume(scanner: Scanner) {
        println("Enter the length of the side of the cube:")
        val side = scanner.nextDouble()
        val volume = side * side * side
        println("The volume of a cube: $volume cubic units")
    }
}