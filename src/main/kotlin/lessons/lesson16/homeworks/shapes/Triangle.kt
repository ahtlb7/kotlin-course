package lessons.lesson16.homeworks.shapes

import kotlin.math.sin

class Triangle(val sideA: Double, val sideB: Double, val angleDegrees: Double) : Shape() {
    override fun area(): Double {
        // Используем стандартный Java-метод Math.toRadians (он работает без импортов)
        return 0.5 * sideA * sideB * sin(Math.toRadians(angleDegrees))
    }
}