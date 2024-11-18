import kotlin.math.sqrt

class Triangle(val a: Double, val b: Double, val c: Double) {

    // The code blocks which run with constructor
    init {
        println("Triangle created with a = $a, b = $b and c = $c")
        println("Triangle area is ${area()}")
        println("Triangle perimeter is ${perimeter()}")
    }

    // Methods
    fun perimeter() = a + b + c

    fun area() = sqrt((perimeter() / 2) * (perimeter() / 2 - a) * (perimeter() / 2 - b) * (perimeter() / 2 - c))
}
